package dao;

import java.util.List;
import model.Classroom;
import utils.DbConnection_MySQL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ClassroomService implements ClassroomManagerInterface {

    private final DbConnection_MySQL db = new DbConnection_MySQL();
    private final Classroom globalClassroom = new Classroom();
    private final List<Classroom> classrooms = new ArrayList();

    @Override
    public Classroom getClassroomById(int classroomId) {
        try {
            if (db.connect()) {
                String query = "SELECT * FROM salon WHERE id = " + classroomId + ";";
                ResultSet rs = (ResultSet) db.execute(query, false);
                if (rs.next()) {
                    globalClassroom.setId(rs.getInt("id"));
                    globalClassroom.setName(rs.getString("nombre"));
                    globalClassroom.setStudents(new ArrayList()); // TODO: obtener lista de alumnos
                }
            } else {
                System.out.println("Error de conexion");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            db.disconnect();
        }
        return globalClassroom;
    }

    @Override
    public int getClassroomIdByName(String name) {
        int id = 0;
        try {
            if (db.connect()) {
                String query = "SELECT id FROM salon WHERE nombre = '" + name + "';";
                ResultSet rs = (ResultSet) db.execute(query, false);
                if (rs.next()) {
                    id = rs.getInt("id");
                }
            } else {
                System.out.println("Error de conexion");
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            db.disconnect();
        }
        return id;
    }

    @Override
    public List<Classroom> getClassrooms() {
        try {
            if (db.connect()) {
                String query = "SELECT * FROM salon";
                ResultSet rs = (ResultSet) db.execute(query, false);
                while (rs.next()) {
                    Classroom localClassroom = new Classroom();
                    localClassroom.setId(rs.getInt("id"));
                    localClassroom.setName(rs.getString("nombre"));
                    localClassroom.setStudents(new ArrayList()); // TODO: obtener lista de alumnos
                    classrooms.add(localClassroom);
                }
            } else {
                System.out.println("Error de conexion");
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            db.disconnect();
        }
        return classrooms;
    }

    @Override
    public List<Classroom> getFreeClassrooms() {
        try {
            if (db.connect()) {
                String query = "SELECT * FROM salon WHERE cupo_maximo < 30;";
                ResultSet rs = (ResultSet) db.execute(query, false);
                while (rs.next()) {
                    Classroom localClassroom = new Classroom();
                    localClassroom.setId(rs.getInt("id"));
                    localClassroom.setName(rs.getString("nombre"));
                    localClassroom.setStudents(new ArrayList()); // TODO: obtener lista de alumnos
                    classrooms.add(localClassroom);
                }
            } else {
                System.out.println("Error de conexion");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            db.disconnect();
        }
        return classrooms;
    }

}
