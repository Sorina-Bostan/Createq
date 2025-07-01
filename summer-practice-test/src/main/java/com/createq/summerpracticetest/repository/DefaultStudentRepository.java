package com.createq.summerpracticetest.repository;

import com.createq.summerpracticetest.model.StudentModel;

import java.util.ArrayList;
import java.util.List;

public class DefaultStudentRepository implements StudentRepository {
    @Override
    public List<StudentModel> getAll(){
        List<StudentModel> list = new ArrayList<>();
        StudentModel studentModel1 = new StudentModel();
        studentModel1.setId(1);
        studentModel1.setName("Alex");
        studentModel1.setAge(22);
        StudentModel studentModel2 = new StudentModel();
        studentModel2.setId(2);
        studentModel2.setName("George");
        studentModel2.setAge(20);
        StudentModel studentModel3 = new StudentModel();
        studentModel3.setId(3);
        studentModel3.setName("Carla");
        studentModel3.setAge(21);
        list.add(studentModel1);
        list.add(studentModel2);
        list.add(studentModel3);

        return list;
    }
}
