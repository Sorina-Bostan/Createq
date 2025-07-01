package com.createq.summerpracticetest.serviceImpl;

import com.createq.summerpracticetest.model.StudentModel;
import com.createq.summerpracticetest.repositoryImpl.DefaultStudentRepository;
import com.createq.summerpracticetest.repository.StudentRepository;
import com.createq.summerpracticetest.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

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
