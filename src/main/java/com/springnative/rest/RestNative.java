package com.springnative.rest;

import com.springnative.model.Student;
import com.springnative.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RestNative {
    
    @Autowired
    StudentService studentService;
    
    @GetMapping("/save")
    @ResponseBody
    public String sayHello() {
        Student student = new Student();
        student.setAge(20);
        studentService.saveOrUpdate(student);
        return "Done";
    }
    
    @GetMapping("/")
    @ResponseBody
    public String home() {
        return "This is the homepage";
    }
    
    @GetMapping("/student/{id}")
    @ResponseBody
    private Student getStudent(@PathVariable("id") int id) {
        return studentService.getStudentById(id);
    }
}
