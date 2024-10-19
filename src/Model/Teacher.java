package Model;

import java.util.List;

//Clase referente a Profesor
public class Teacher extends Person implements ComparableObject{
    
    private List<Subject> subjects;

    public Teacher(Teacher data, List<Subject> subjects) {
        super(data);
        this.subjects = subjects;
    }
    
    public Teacher(String names, String surnames, int identification, int id, List<Subject> subjects) {
        super(names, surnames, identification, id);
        this.subjects = subjects;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    @Override
    public int compareTo(ComparableObject other) {
        if (other instanceof Teacher) {
            return Integer.compare(this.id, ((Teacher) other).id);
        }
        return 0;
    }

    
}
