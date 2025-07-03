package com.createq.summerpracticetest.facades.impl;

import com.createq.summerpracticetest.converter.StudentConverter;
import com.createq.summerpracticetest.dto.StudentDTO;
import com.createq.summerpracticetest.facades.StudentFacade;
import com.createq.summerpracticetest.model.StudentModel;
import com.createq.summerpracticetest.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DefaultStudentFacade implements StudentFacade {

    private StudentService studentService;
    private StudentConverter studentConverter;

    @Autowired
    public DefaultStudentFacade(StudentService studentService, StudentConverter studentConverter) {
        this.studentService = studentService;
        this.studentConverter = studentConverter;
    }
    @Override
    public List<StudentDTO> getAll(){
        List<StudentModel> studentModels = studentService.getAll();
        List<StudentDTO> studentDTO =studentConverter.convertAll(studentModels);
        return studentDTO;

    }
}
