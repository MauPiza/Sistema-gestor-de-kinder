package dao;

import java.util.List;
import model.Student;
import model.Tutor;

public interface TutorManagerInterface {

    public boolean createTutor(Tutor tutor);

    public Tutor getTutor(int tutorId);
    
    public int getLastTutorAdded();
    
    public List<Tutor> getTutors();

    public List<Student> getKids(int tutorId);
}
