package com.example.studentservice.service;

import com.example.studentservice.model.Student;

import java.util.List;

public interface StudentService {
    public String  AddStudent(Student student);

    public List<Student> GetAllStudents();
}
