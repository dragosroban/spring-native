package com.springnative.service;

import java.util.ArrayList;
import java.util.List;

import com.springnative.model.Student;
import com.springnative.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    
    @Autowired
    StudentRepository studentRepository;
    
    //getting a specific record
    public Student getStudentById(int id) {
        return studentRepository.findById(id).get();
    }
    
    public void saveOrUpdate(Student student) {
        studentRepository.save(student);
    }
    
    //deleting a specific record
    public void delete(int id) {
        studentRepository.deleteById(id);
    }
}