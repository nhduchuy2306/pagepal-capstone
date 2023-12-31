//package com.pagepal.webapi.controllers;
//
//import org.springframework.graphql.data.method.annotation.Argument;
//import org.springframework.graphql.data.method.annotation.MutationMapping;
//import org.springframework.graphql.data.method.annotation.QueryMapping;
//import org.springframework.stereotype.Controller;
//
//import java.util.List;
//import java.util.UUID;
//
//@Controller
//public class StudentController {
//
//    private final StudentService studentService;
//
//    public StudentController(StudentService studentService) {
//        this.studentService = studentService;
//    }
//
//    @QueryMapping
//    public List<Student> getStudents() {
//        return studentService.getStudents();
//    }
//
//    @QueryMapping
//    public Student getStudentById(@Argument UUID id) {
//        return studentService.getStudentById(id).orElse(null);
//    }
//
//    @MutationMapping
//    public Student createStudent(@Argument Student student) {
//        return studentService.createStudent(student);
//    }
//}
