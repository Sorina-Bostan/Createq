package com.createq.summerpracticetest.model;

import java.util.List;

public class SchoolModel {
    private int id;
    private String name;
    private List<StudentModel> students;

    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public List<StudentModel> getStudents(){
        return this.students;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setStudents(List<StudentModel> students){
        this.students = students;
    }
}
