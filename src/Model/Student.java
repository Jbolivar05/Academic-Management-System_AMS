
package Model;

import java.util.List;

/**
 *
 * @author Jorge
 */
//Clase referente a Estudiante
public class Student extends Person{

    private List<Course> course;

    public Student(Student data) {
        super(data);
        this.course = data.course;
    }

    public Student(String names, String surnames, int identification, List<Course> course) {
        super(names, surnames, identification);
        this.course = course;
    }



    public List<Course> getCourse() {
        return course;
    }

    public void setCourse(List<Course> course) {
        this.course = course;
    } 

    
    
}
