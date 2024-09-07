package com.hibernate.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Resources {

    @Id
    @GeneratedValue
    private Integer resourcesId;
    private String name;
    private String size;
    private String url;

    public Resources() {
    }

    public Resources(Integer resourcesId, String name, String size, String url) {
        this.resourcesId = resourcesId;
        this.name = name;
        this.size = size;
        this.url = url;
    }

    public Integer getResourcesId() {
        return resourcesId;
    }

    public void setResourcesId(Integer resourcesId) {
        this.resourcesId = resourcesId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
