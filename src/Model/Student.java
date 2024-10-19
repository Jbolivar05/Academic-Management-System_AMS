
package Model;

import java.util.List;

/**
 *
 * @author Jorge
 */
//Clase referente a Estudiante
public class Student extends Person implements ComparableObject{

    private List<Course> course;


    Student(Person data, List<Course> course) {
        super(data);
        this.course = course;
    }

    public Student(String names, String surnames, int identification, int id, List<Course> course) {
        super(names, surnames, identification, id);
        this.course = course;
    }
   
    public List<Course> getCourse() {
        return course;
    }

    public void setCourse(List<Course> course) {
        this.course = course;
    }

    @Override
    public int compareTo(ComparableObject other) {
        if (other instanceof Student) {
            return Integer.compare(this.id, ((Student) other).id);
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", names=" + names + ", surnames=" + surnames + ", identification="
                + identification + ", course=" + course + "]";
    } 

    
    
    
}
