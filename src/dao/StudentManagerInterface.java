package dao;

import java.time.LocalDate;
import java.util.List;
import model.Student;
import model.Subjects;

public interface StudentManagerInterface {
    
    public boolean newStudent(Student student);
    public char setGroup(boolean isAvailable);
    public char setGrade(int age);
    public List<Subjects> setSubjects(int grade);
    public int getYearDiff(LocalDate currentDate, LocalDate birthDate);

}
