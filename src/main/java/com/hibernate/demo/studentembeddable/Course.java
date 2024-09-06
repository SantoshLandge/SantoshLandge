package com.hibernate.demo.studentembeddable;

import jakarta.persistence.Embeddable;

@Embeddable
public class Course {

    private String course_name;
    private String course_duration;

    public Course() {
    }

    public Course(String course_name, String course_duration) {
        this.course_name = course_name;
        this.course_duration = course_duration;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public String getCourse_duration() {
        return course_duration;
    }

    public void setCourse_duration(String course_duration) {
        this.course_duration = course_duration;
    }
}
