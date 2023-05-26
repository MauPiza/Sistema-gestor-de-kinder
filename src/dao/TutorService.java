package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Student;
import model.Tutor;
import utils.DbConnection_MySQL;

public class TutorService implements TutorManagerInterface {

    DbConnection_MySQL db = new DbConnection_MySQL();
    Tutor tutor = new Tutor();

    @Override
    public boolean createTutor(Tutor tutor) {
        boolean created = false;
        StringBuilder query = new StringBuilder();
        try {
            if (db.connect()) {
                query.append("INSERT INTO tutor VALUES(0, '")
                        .append(tutor.getName())
                        .append("', '")
                        .append(tutor.getF_lastname())
                        .append("', '")
                        .append(tutor.getS_lastname())
                        .append("', '")
                        .append(tutor.getEmail())
                        .append("');");
                if ((boolean) db.execute(query.toString(), true)) {
                    System.out.println("Registro exitoso, tutor creado");
                    created = true;
                } else {
                    System.out.println("No se completó el registro de tutor");
                }
            } else {
                System.out.println("Error de conexión");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            db.disconnect();
        }
        return created;
    }

    @Override
    public Tutor getTutor(int tutorId) {
        try {
            String query = "SELECT * FROM tutor WHERE id_tutor = " + tutorId + ";";
            ResultSet rs = (ResultSet) db.execute(query, false);
            if (rs.next()) {
                tutor.setIdtutor(rs.getInt("id_tutor"));
                tutor.setName(rs.getString("nombre"));
                tutor.setF_lastname(rs.getString("apellido_paterno"));
                tutor.setS_lastname(rs.getString("apellido_materno"));
                tutor.setEmail(rs.getString("correo_electronico"));
            } else {
                System.out.println("Sin resultados");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            db.disconnect();
        }
        return tutor;
    }

    @Override
    public List<Tutor> getTutors() {
        List<Tutor> tutors = new ArrayList();
        try {
            String query = "SELECT * FROM tutor";
            ResultSet rs = (ResultSet) db.execute(query, false);
            while (rs.next()) {
                Tutor nTutor = new Tutor();
                nTutor.setIdtutor(rs.getInt("id_tutor"));
                nTutor.setName(rs.getString("nombre"));
                nTutor.setF_lastname(rs.getString("apellido_paterno"));
                nTutor.setS_lastname(rs.getString("apellido_materno"));
                nTutor.setEmail(rs.getString("correo_electronico"));
                tutors.add(nTutor);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            db.disconnect();
        }
        return tutors;
    }

    @Override
    public List<Student> getKids(int tutorId) {
        List<Student> kids = new ArrayList();
        try {
            StringBuilder query = new StringBuilder();
            query.append("SELECT nombre_alumno, apellido_paterno, apellido_materno, ")
                    .append("CURP, grado, grupo")
                    .append("FROM alumno WHERE id_alumno = ")
                    .append(tutorId)
                    .append(";");
            ResultSet rs = (ResultSet) db.execute(query.toString(), false);
            while (rs.next()) {
                Student nStudent = new Student();
                nStudent.setName(rs.getString("nombre_alumno"));
                nStudent.setF_lastname(rs.getString("apellido_paterno"));
                nStudent.setS_lastname(rs.getString("apellido_materno"));
                nStudent.setCurp(rs.getString("CURP"));
                nStudent.setGrade((char) rs.getObject("grado"));
                nStudent.setGroup((char) rs.getObject("grupo"));
                kids.add(nStudent);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            db.disconnect();
        }
        return kids;
    }

}
