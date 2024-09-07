package com.hibernate.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Lecture {

    @Id
    @GeneratedValue
    private Integer lectureId;
    private String name;

    public Lecture() {
    }

    public Lecture(Integer lectureId, String name) {
        this.lectureId = lectureId;
        this.name = name;
    }

    public Integer getLectureId() {
        return lectureId;
    }

    public void setLectureId(Integer lectureId) {
        this.lectureId = lectureId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
