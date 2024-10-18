package Model;

import java.util.List;

//Clase referente a Materia
public class Subject {

    private int id;
    private String name;
    private Teacher teacher;
    private GradingPeriod gradingPeriod;
    private List<Activities> activities;

    public Subject(int id, String name, Teacher teacher, GradingPeriod gradingPeriod, List<Activities> activities) {
        this.id = id;
        this.name = name;
        this.teacher = teacher;
        this.gradingPeriod = gradingPeriod;
        this.activities = activities;
    }

    public Subject(Subject data) {
        this.id = data.id;
        this.name = data.name;
        this.activities = data.activities;
        this.teacher = data.teacher;
        this.gradingPeriod = data.gradingPeriod;
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

    public List<Activities> getActivities() {
        return activities;
    }

    public void setActivities(List<Activities> activities) {
        this.activities = activities;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public GradingPeriod getGradingPeriod() {
        return gradingPeriod;
    }

    public void setGradingPeriod(GradingPeriod gradingPeriod) {
        this.gradingPeriod = gradingPeriod;
    }

}
