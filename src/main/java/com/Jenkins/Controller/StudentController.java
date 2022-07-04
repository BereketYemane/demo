package com.Jenkins.Controller;

import com.Jenkins.Domain.Student;
import com.Jenkins.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("students")
public class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping
    public Student getStudent(){
        return studentService.getStudent();
    }
}
