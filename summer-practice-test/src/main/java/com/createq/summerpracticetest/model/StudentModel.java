package com.createq.summerpracticetest.model;


import jakarta.persistence.*;

@Entity
public class StudentModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private int age;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="school_id")
    private SchoolModel school;

    public Long getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public SchoolModel getSchool(){
        return this.school;
    }
    public void setId(Long id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setSchool(SchoolModel school){
        this.school = school;
    }
}
