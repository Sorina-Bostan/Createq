package com.createq.summerpracticetest.repositoryImpl;

import com.createq.summerpracticetest.model.SchoolModel;
import com.createq.summerpracticetest.model.StudentModel;
import com.createq.summerpracticetest.repository.SchoolRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

public class DefaultSchoolRepository implements SchoolRepository {
    @Override
    public List<SchoolModel> getAll(){
        List<SchoolModel> list = new ArrayList<>();
        SchoolModel schoolModel1 = new SchoolModel();
        SchoolModel schoolModel2 = new SchoolModel();
        schoolModel1.setId(1);
        schoolModel1.setName("Gheorghe Asachi");
        schoolModel1.setStudents(createstudentsList());

        schoolModel2.setId(1);
        schoolModel2.setName("Mihai Eminescu");
        schoolModel2.setStudents(createstudentsList());

        list.add(schoolModel1);
        list.add(schoolModel2);

        return list;
    }
    public List<StudentModel> createstudentsList(){
        List<StudentModel> list = new ArrayList<>();
        StudentModel studentModel1 = new StudentModel();
        studentModel1.setId(1);
        studentModel1.setName("Gabriela");
        studentModel1.setAge(22);
        StudentModel studentModel2 = new StudentModel();
        studentModel2.setId(2);
        studentModel2.setName("Andrei");
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
