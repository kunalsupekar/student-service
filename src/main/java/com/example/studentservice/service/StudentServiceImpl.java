package com.example.studentservice.service;


import com.example.studentservice.model.Student;
import com.example.studentservice.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;
    public String  AddStudent(Student student){
        System.out.println("adding student");
        studentRepository.save (student);

        return  "student saved successfully";

    }


    public List<Student> GetAllStudents() {
        return (List<Student>) studentRepository.findAll();
    }
}
