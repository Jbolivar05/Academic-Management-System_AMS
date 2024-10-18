package Model;

import java.util.List;

//Clase referente a Profesor
public class Teacher extends Person{
    
    private List<Subject> subjects;

    public Teacher(Teacher data) {
        super(data);
        this.subjects = data.subjects;
    }
    
    public Teacher(String names, String surnames, int identification, List<Subject> subjects) {
        super(names, surnames, identification);
        this.subjects = subjects;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    
}
