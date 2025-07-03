package com.createq.summerpracticetest.converter;

import com.createq.summerpracticetest.dto.SchoolDTO;
import com.createq.summerpracticetest.dto.StudentDTO;
import com.createq.summerpracticetest.model.SchoolModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SchoolConverter {
    private final StudentConverter studentConverter;

    @Autowired
    public SchoolConverter(StudentConverter studentConverter) {
        this.studentConverter = studentConverter;
    }
    SchoolDTO convert(SchoolModel schoolModel){
        SchoolDTO schoolDTO = new SchoolDTO();
        schoolDTO.setId(schoolModel.getId());
        schoolDTO.setName(schoolModel.getName());
        if (schoolModel.getStudents() != null && !schoolModel.getStudents().isEmpty()) {
            List<StudentDTO> studentDTOs = studentConverter.convertAll(schoolModel.getStudents());
            schoolDTO.setStudents(studentDTOs);
        }
        return schoolDTO;
    }
    public List<SchoolDTO> convertAll(List<SchoolModel> schoolModels) {
        List<SchoolDTO> schoolDTOs = new ArrayList<>();
        for (SchoolModel schoolModel : schoolModels) {
            schoolDTOs.add(convert(schoolModel));
        }
        return schoolDTOs;
    }
}
