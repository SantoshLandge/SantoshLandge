package com.hibernate.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Section {

    @Id
    @GeneratedValue
    private Integer sectionId;
    private String sectionName;
    private String sectOrder;

    public Section() {
    }

    public Section(Integer sectionId, String sectionName, String sectOrder) {
        this.sectionId = sectionId;
        this.sectionName = sectionName;
        this.sectOrder = sectOrder;
    }

    public Integer getSectionId() {
        return sectionId;
    }

    public void setSectionId(Integer sectionId) {
        this.sectionId = sectionId;
    }

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    public String getSectOrder() {
        return sectOrder;
    }

    public void setSectOrder(String sectOrder) {
        this.sectOrder = sectOrder;
    }
}
