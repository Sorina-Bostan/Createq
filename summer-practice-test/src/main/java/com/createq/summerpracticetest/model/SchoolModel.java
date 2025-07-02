package com.createq.summerpracticetest.model;

import jakarta.persistence.*;

import java.util.List;


@Entity
public class SchoolModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @OneToMany(mappedBy="school")
    private List<StudentModel> students;

    public Long getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public List<StudentModel> getStudents(){
        return this.students;
    }
    public void setId(Long id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setStudents(List<StudentModel> students){
        this.students = students;
    }
}
