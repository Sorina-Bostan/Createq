package com.createq.summerpracticetest.repository;

import com.createq.summerpracticetest.model.StudentModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<StudentModel,Long> {
}
