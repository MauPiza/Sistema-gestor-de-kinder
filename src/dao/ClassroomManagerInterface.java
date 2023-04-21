package dao;

import java.util.List;
import model.Classroom;

public interface ClassroomManagerInterface {
    // Recupera un salón de la base de datos por su ID

    public Classroom getClassroomById(int salonId);

    // Recupera todos los salones de la base de datos
    public List<Classroom> getClassrooms();

    // Recupera una lista de salones que tengan cupo disponible para un nuevo alumno
    public List<Classroom> getFreeClassrooms();
}