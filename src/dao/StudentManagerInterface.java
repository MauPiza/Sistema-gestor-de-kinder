package dao;

import java.time.LocalDate;
import model.Student;

public interface StudentManagerInterface {

    public boolean newStudent(Student student);

    public char setGroup(char grade);

    public char setGrade(int age);

    public int calculateAge(LocalDate currentDate, LocalDate birthDate);

}
