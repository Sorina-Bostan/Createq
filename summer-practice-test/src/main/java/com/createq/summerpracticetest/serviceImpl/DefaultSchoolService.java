package com.createq.summerpracticetest.serviceImpl;

import com.createq.summerpracticetest.model.SchoolModel;
import com.createq.summerpracticetest.repository.SchoolRepository;
import com.createq.summerpracticetest.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DefaultSchoolService implements SchoolService {

    private final SchoolRepository schoolRepository;

    public SchoolRepository getSchoolRepository() {
        return this.schoolRepository;
    }

    @Autowired
    public DefaultSchoolService(SchoolRepository schoolRepository) {
        this.schoolRepository = schoolRepository;
    }

    @Override
    public List<SchoolModel> getAll() {
        return this.schoolRepository.findAll();
    }
}
