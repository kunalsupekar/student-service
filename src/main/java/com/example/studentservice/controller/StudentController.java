package com.example.studentservice.controller;


import com.example.studentservice.model.Student;
import com.example.studentservice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Api/student")
public class StudentController {

    @Autowired
    private StudentService studentService;
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String AddStudents(@RequestBody Student student){
        System.out.println("call coming to controller for adding");
         return this.studentService.AddStudent(student);


    }
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List <Student>  Allstudents(){

        return this.studentService.GetAllStudents();
    }



}
