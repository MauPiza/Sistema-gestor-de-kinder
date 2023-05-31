package dao;

import java.util.List;
import model.Classroom;
import model.Student;

public interface ClassroomManagerInterface {
    // Recupera un salón de la base de datos por su ID

    public Classroom getClassroomById(int salonId);
    
    //Recupera un salon mediante su campo 'nombre'
    public int getClassroomIdByName(String name);
    
    // Recupera todos los salones de la base de datos
    public List<Classroom> getAllClassrooms();
    
    //Recupera los salones donde existan alumnos
    public List<Integer> getClassroomsIdOccupated();

    // Recupera una lista de salones que tengan cupo disponible para un nuevo alumno
    public List<Classroom> getFreeClassrooms();
    
}
