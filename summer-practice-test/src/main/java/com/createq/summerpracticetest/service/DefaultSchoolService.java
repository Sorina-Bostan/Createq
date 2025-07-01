package com.createq.summerpracticetest.service;

import com.createq.summerpracticetest.model.SchoolModel;
import com.createq.summerpracticetest.repository.DefaultSchoolRepository;
import com.createq.summerpracticetest.repository.SchoolRepository;

import java.util.List;

public class DefaultSchoolService implements SchoolService {
    private final SchoolRepository schoolRepository;
    public SchoolRepository getSchoolRepository() {
        return this.schoolRepository;
    }
    public DefaultSchoolService(SchoolRepository schoolRepository) {
        this.schoolRepository = new DefaultSchoolRepository();
    }
    @Override
    public List<SchoolModel> getAll() {
        return this.schoolRepository.getAll();
    }
}
