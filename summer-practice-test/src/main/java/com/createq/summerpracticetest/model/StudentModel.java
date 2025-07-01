package com.createq.summerpracticetest.model;

public class StudentModel {
    private int id;
    private String name;
    private int age;
    private SchoolModel school;

    public int getId(){
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
    public void setId(int id){
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
