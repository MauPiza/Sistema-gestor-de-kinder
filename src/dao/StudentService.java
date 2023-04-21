package dao;

import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Classroom;
import model.Student;
import model.Subjects;
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
    public char setGroup(boolean isAvailable) {
        try {
            List<Classroom> classrooms = classroomService.getFreeClassrooms();
            boolean isGroupSetted = false;
            while (isGroupSetted == false) {
                classrooms.forEach(classroom -> {

                });
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            db.disconnect();
        }
        return 't';
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
    public List<Subjects> setSubjects(int grade) {
        List<Subjects> subjects = new ArrayList();
        switch (grade) {
            case 1 -> {
                break;
            }
            case 2 -> {
                break;
            }
            case 3 -> {
                break;
            }
        }
        return new ArrayList();
    }

    

    public boolean getGroupSize(char group) {
        try {
            int rowsFetched = -1;
            if (db.connect()) {
                String query;
                query = "SELECT COUNT(*) FROM alumno WHERE grupo = " + group;
                ResultSet rs = (ResultSet) db.execute(query, false);
                if (rs.next()) {
                    rowsFetched = rs.getFetchSize();
                }
                if (rowsFetched <= 30) {

                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            db.disconnect();
        }
        return true;
    }

    public int calculateAgeByCurp(String curp) {
        LocalDate currentDate = LocalDate.now();
        String year = curp.substring(4, 6);
        String month = curp.substring(6, 8);
        String day = curp.substring(8, 10);
        LocalDate birthDate = LocalDate.of(Integer.valueOf(year), Integer.valueOf(month), Integer.valueOf(day));
        int age = getYearDiff(currentDate, birthDate);
        return age;
    }
    
    @Override
    public int getYearDiff(LocalDate actualDate, LocalDate birthDate) {
        int age = 0;
        age = (int) actualDate.minusYears((long) birthDate.getYear()).minusYears(2000).getYear();
        return age;
    }

}
