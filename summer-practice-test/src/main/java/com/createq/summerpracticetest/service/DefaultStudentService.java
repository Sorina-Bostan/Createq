package com.createq.summerpracticetest.service;

import com.createq.summerpracticetest.model.StudentModel;
import com.createq.summerpracticetest.repository.DefaultStudentRepository;
import com.createq.summerpracticetest.repository.StudentRepository;

import java.util.ArrayList;
import java.util.List;

public class DefaultStudentService implements StudentService {

    private final StudentRepository studentRepository;

    public DefaultStudentService(StudentRepository studentRepository) {
        this.studentRepository = new DefaultStudentRepository();
    }

    public StudentRepository getStudentRepository() {
        return this.studentRepository;
    }

    @Override
    public List<StudentModel> getAll(){
        return studentRepository.getAll();
    }
}
