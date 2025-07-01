package com.createq.summerpracticetest.repository;

import com.createq.summerpracticetest.model.SchoolModel;
import com.createq.summerpracticetest.model.StudentModel;

import java.util.ArrayList;
import java.util.List;

public class DefaultSchoolRepository implements SchoolRepository {
    @Override
    public List<SchoolModel> getAll(){
        List<SchoolModel> list = new ArrayList<>();
        DefaultStudentRepository defaultStudentRepository = new DefaultStudentRepository();
        SchoolModel schoolModel1 = new SchoolModel();
        SchoolModel schoolModel2 = new SchoolModel();
        schoolModel1.setId(1);
        schoolModel1.setName("Gheorghe Asachi");
        schoolModel1.setStudents(defaultStudentRepository.getAll());

        schoolModel2.setId(1);
        schoolModel2.setName("Mihai Eminescu");
        schoolModel2.setStudents(defaultStudentRepository.getAll());

        return list;

    }
}
