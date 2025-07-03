package com.createq.summerpracticetest.dto;

import java.util.List;

public class SchoolDTO {
    private Long id;
    private String name;
    private List<StudentDTO> students;

    public Long getId(){ return this.id; }
    public void setId(Long id){ this.id = id; }
    public String getName() { return this.name; }
    public void setName(String name) { this.name = name; }
    public List<StudentDTO> getStudents(){ return this.students; }
    public void setStudents(List<StudentDTO> students){ this.students = students; }
}
