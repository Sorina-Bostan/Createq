package com.createq.summerpracticetest.converter;

import com.createq.summerpracticetest.dto.StudentDTO;
import com.createq.summerpracticetest.model.StudentModel;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class StudentConverter {
    StudentDTO convert(StudentModel studentModel){
        if(studentModel == null) {
            return null;
        }
        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setId(studentModel.getId());
        studentDTO.setName(studentModel.getName());
        return studentDTO;
    }
    public List<StudentDTO> convertAll(List<StudentModel> studentsModel) {
        if(studentsModel == null) { return null;}
        List<StudentDTO> studentDTOList = new ArrayList<>();
        for(StudentModel studentModel : studentsModel) {
            studentDTOList.add(convert(studentModel));
        }
        return studentDTOList;
    }

}
