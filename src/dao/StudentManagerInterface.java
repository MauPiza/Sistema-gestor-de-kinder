package dao;

import java.util.List;
import model.Student;

public interface StudentManagerInterface {

    public boolean newStudent(Student student);

    public char setGroup(char grade);

    public char setGrade(int age);
    
    public int setCourse(char level);
        
    //Recupera lista de alumnos inscritos en determinado salon
    public List<Student> getStudentsByClassroom(int classroomId);

}
