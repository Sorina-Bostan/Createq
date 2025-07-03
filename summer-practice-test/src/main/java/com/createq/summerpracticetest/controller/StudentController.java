package com.createq.summerpracticetest.controller;
import com.createq.summerpracticetest.facades.StudentFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {
    private StudentFacade studentFacade;
    @Autowired
    public StudentController(StudentFacade studentFacade){
        this.studentFacade = studentFacade;
    }

    @GetMapping("students")
    public String getAll(Model model){
        model.addAttribute("students", studentFacade.getAll());
        return "";
    }
}
