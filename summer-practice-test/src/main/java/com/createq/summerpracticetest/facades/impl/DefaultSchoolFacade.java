package com.createq.summerpracticetest.facades.impl;

import com.createq.summerpracticetest.converter.SchoolConverter;
import com.createq.summerpracticetest.dto.SchoolDTO;
import com.createq.summerpracticetest.facades.SchoolFacade;
import com.createq.summerpracticetest.model.SchoolModel;
import com.createq.summerpracticetest.model.StudentModel;
import com.createq.summerpracticetest.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DefaultSchoolFacade implements SchoolFacade {

    private SchoolService schoolService;
    private SchoolConverter schoolConverter;

    @Autowired
    public DefaultSchoolFacade(SchoolService schoolService, SchoolConverter schoolConverter) {
        this.schoolService = schoolService;
        this.schoolConverter = schoolConverter;
    }
    @Override
    public List<SchoolDTO> getAll(){
        List<SchoolModel> schoolModels = schoolService.getAll();
        List<SchoolDTO> schoolDTOs =  schoolConverter.convertAll(schoolModels);
        return schoolDTOs;
    }
}
