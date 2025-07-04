package com.createq.summerpracticetest.dto;

public class StudentDTO {
    private Long id;
    private String name;
    private int age;

    public Long getId(){ return this.id; }
    public void setId(Long id){ this.id = id; }
    public String getName() { return this.name; }
    public void setName(String name) { this.name = name; }
    public int getAge() { return this.age; }
    public void setAge(int age) { this.age = age; }
}
