package dao;

import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Student;
import model.Tutor;
import utils.DbConnection_MySQL;

public class StudentService implements StudentManagerInterface {

    DbConnection_MySQL db = new DbConnection_MySQL();
    Student student = new Student();
    Tutor tutor = new Tutor();
    List<Student> kids = new ArrayList();
    ClassroomService classroomService = new ClassroomService();

    @Override
    public boolean newStudent(Student student) {
        boolean created = false;
        try {
            if (db.connect()) {
                StringBuilder query = new StringBuilder();
                query.append("INSERT INTO alumno VALUES(0,")
                        .append(student.getIdTutor())
                        .append(",")
                        .append(student.getIdCourse())
                        .append(", '")
                        .append(student.getName())
                        .append("', '")
                        .append(student.getF_lastname())
                        .append("', '")
                        .append(student.getS_lastname())
                        .append("', '")
                        .append(student.getBirthday())
                        .append("', '")
                        .append(student.getCurp())
                        .append("', '")
                        .append(student.getAge())
                        .append("', '")
                        .append(student.getGender())
                        .append("', '")
                        .append(student.getGroup())
                        .append("', '")
                        .append(student.getGrade())
                        .append("');");
                if ((boolean) db.execute(query.toString(), true)) {
                    JOptionPane.showMessageDialog(null, "Alumno inscrito");
                    created = true;
                } else {
                    JOptionPane.showMessageDialog(null, "No se ha completado la inscripcion");
                }
            } else {
                System.out.println("Error de conexion");
            }
        } catch (HeadlessException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            db.disconnect();
        }
        return created;
    }

    @Override
    public char setGroup(char grade) {
        char groupChar = '0';
        try {
            if (db.connect()) {
                StringBuilder query;
                //Se crea un bucle que permite iterar los cuatro grupos que hay
                //basandose en el grado (1, 2 o 3)
                for (int i = 0; i < 4; i++) {
                    //Se crea la consulta para buscar los salones concatenando
                    //el grado y el grupo (1-A...1-D , 2-A...2-D, 3-A...3-D)
                    query = new StringBuilder();
                    query.append("SELECT * FROM salon WHERE nombre = '").append(grade);
                    switch (i) {
                        case 0 ->
                            query.append("-A';");
                        case 1 ->
                            query.append("-B';");
                        case 2 ->
                            query.append("-C';");
                        case 3 ->
                            query.append("-D';");
                        default -> {
                            JOptionPane.showMessageDialog(null, "No existen cupos disponibles por el momento");
                            return 0;
                        }
                    }
                    //Ejecuta la consulta y obtiene el tamaño de filas obtenidas
                    //valida si dicho tamaño es menor igual a 25, de ser cierto
                    //se obtiene el grupo en el cual entró al 'if', mismo que
                    //rompe el ciclo del for
                    ResultSet rs = (ResultSet) db.execute(query.toString(), false);
                    int fetchSize = rs.getFetchSize();
                    if (fetchSize <= 25) {
                        groupChar = query.charAt(38);
                        break;
                    }
                }
            } else {
                System.out.println("Error de conexión");
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            db.disconnect();
        }
        return groupChar;
    }

    @Override
    public char setGrade(int age) {
        char grade;
        grade = switch (age) {
            case 3 ->
                '1';
            case 4 ->
                '2';
            case 5 ->
                '3';
            default ->
                '0';
        };
        return grade;
    }

    @Override
    public int calculateAge(LocalDate currentDate, LocalDate birthDate) {
        int age = (int) currentDate.minusYears((long) birthDate.getYear()).minusYears(2000).getYear();
        return age;
    }

    /**
     * @param curp
     * @return returns index 0 to birthday, or 1 to age
     */
    public List<Object> getAgeAndBirthday(String curp) {
        List<Object> ageValues = new ArrayList();
        LocalDate currentDate = LocalDate.now();
        String year = curp.substring(4, 6);
        String month = curp.substring(6, 8);
        String day = curp.substring(8, 10);
        LocalDate birthDate = LocalDate.of(Integer.valueOf(year), Integer.valueOf(month), Integer.valueOf(day));
        int age = calculateAge(currentDate, birthDate);
        ageValues.add(birthDate);
        ageValues.add(age);
        return ageValues;
    }

    public char getGenderByCurp(String curp) {
        return curp.toUpperCase().charAt(10);
    }
}
