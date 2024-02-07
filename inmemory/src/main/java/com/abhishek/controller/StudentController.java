package com.abhishek.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.abhishek.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class StudentController {

  @Autowired
  StudentService studentService;

  private List<Student> getAllStudent() {
    return studentService.getAllStudent();
  }

  @GetMapping("/student/{id}")
  public SomeData getMethodName(@RequestParam String param) {
    return new SomeData();

  }

  private Student getStudent(@PathVariable("id") int d) {
    return studentService.getStudentByid(id);
  }

}
