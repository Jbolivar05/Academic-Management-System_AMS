package Model;

import java.util.List;

//Clase referente a Curso
public class Course {
    
    private int id;
    private String name;
    private Teacher classSupervisor;
    private List<Student> student;
    private List<Subject> subject;
    
    public Course(int id, String name, Teacher classSupervisor, List<Student> student, List<Subject> subject) {
        this.id = id;
        this.name = name;
        this.classSupervisor = classSupervisor;
        this.student = student;
        this.subject = subject;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher getClassSupervisor() {
        return classSupervisor;
    }

    public void setClassSupervisor(Teacher classSupervisor) {
        this.classSupervisor = classSupervisor;
    }

    public List<Student> getStudent() {
        return student;
    }

    public void setStudent(List<Student> student) {
        this.student = student;
    }

    public List<Subject> getSubject() {
        return subject;
    }

    public void setSubject(List<Subject> subject) {
        this.subject = subject;
    }

    


}
