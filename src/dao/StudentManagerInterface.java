package dao;

import model.Student;

public interface StudentManagerInterface {

    public boolean newStudent(Student student);

    public char setGroup(char grade);

    public char setGrade(int age);
    
    public int setCourse(char level);

}
