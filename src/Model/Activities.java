package Model;

import java.sql.Date;

//Clase referente a Actividades
public class Activities {

    private int id;
    private String name;
    private double grade;
    private Date submissionDate;
    private Subject subject;

    public Activities(int id, String name, double grade, Date submissionDate, Subject subject) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.submissionDate = submissionDate;
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

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public Date getSubmissionDate() {
        return submissionDate;
    }

    public void setSubmissionDate(Date submissionDate) {
        this.submissionDate = submissionDate;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

}
