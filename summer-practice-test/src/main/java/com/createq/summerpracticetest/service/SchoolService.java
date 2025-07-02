package com.createq.summerpracticetest.service;

import com.createq.summerpracticetest.model.SchoolModel;
import org.springframework.stereotype.Service;

import java.util.List;

public interface SchoolService {
    public List<SchoolModel> getAll();
}
