package com.createq.summerpracticetest.repository;

import com.createq.summerpracticetest.model.StudentModel;

import java.util.List;

public interface StudentRepository {
    public List<StudentModel> getAll();
}
