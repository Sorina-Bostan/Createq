package com.createq.summerpracticetest.controller;

import com.createq.summerpracticetest.facades.SchoolFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SchoolController {
    private SchoolFacade schoolFacade;
    @Autowired
    public SchoolController(SchoolFacade schoolFacade){
        this.schoolFacade = schoolFacade;
    }

    @GetMapping("schools")
    public String getAll(Model model){
        model.addAttribute("schools", schoolFacade.getAll());
        return "";
    }
}
