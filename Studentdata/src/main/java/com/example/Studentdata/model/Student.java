package com.example.Studentdata.model;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Entity
public class Student {
    @jakarta.persistence.Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private long Id;
    @Column(name ="Student_name")
    private String name;
    @Column(name = "College_name")
    private String College;

    @Column(name = "Branch")
    private String branch;

//    private String Group;
//
//    public String getGroup() {
//        return Group;
//    }
//
//    public void setGroup(String group) {
//        Group = group;
//    }

    public Student() {
    }

    public Student(long id, String name, String branch, String college) {
        Id = id;
        this.name = name;
        this.branch = branch;
        College = college;
//        this.Group=group;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getCollege() {
        return College;
    }

    public void setCollege(String college) {
        College = college;
    }



}
