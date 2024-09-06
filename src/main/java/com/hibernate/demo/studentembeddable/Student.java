package com.hibernate.demo.studentembeddable;

import jakarta.persistence.*;

@Entity
@Table(name = "Student_Detail")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String studentName;
    private String city;
    private Course course;

    public Student() {
    }

    public Student(int id, String name, String city, Course course) {
        this.id = id;
        this.studentName = name;
        this.city = city;
        this.course = course;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
