package model;

import java.util.ArrayList;
import java.util.List;

public class Tutor {

    public int idTutor;
    public String name;
    public String f_lastname;
    public String s_lastname;
    public String correoElectronico;
    public List<Student> kids = new ArrayList();

    public Tutor() {
    }

    public int getIdtutor() {
        return idTutor;
    }

    public void setIdtutor(int idtutor) {
        this.idTutor = idtutor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getF_lastname() {
        return f_lastname;
    }

    public void setF_lastname(String f_lastname) {
        this.f_lastname = f_lastname;
    }

    public String getS_lastname() {
        return s_lastname;
    }

    public void setS_lastname(String s_lastname) {
        this.s_lastname = s_lastname;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public List<Student> getKids() {
        return this.kids;
    }

    public void setKids(List<Student> kids) {
        this.kids = kids;
    }
}
