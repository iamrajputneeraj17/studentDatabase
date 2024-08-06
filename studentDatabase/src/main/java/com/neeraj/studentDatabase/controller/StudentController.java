package com.neeraj.studentDatabase.controller;


import com.neeraj.studentDatabase.entity.Student;
import com.neeraj.studentDatabase.services.studentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired

    studentServices stuService;
    @GetMapping("/student")
    public String index()
    {
        return "Hello Fuck!";
    }

    @PostMapping("/store")
    public Student saveStudent(@RequestBody Student student)
    {
        return stuService.create(student);
    }
}
