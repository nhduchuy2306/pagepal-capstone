package com.pagepal.application.services;


import com.pagepal.domain.entities.Student;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface StudentService {
    List<Student> getStudents();
    Optional<Student> getStudentById(UUID id);
    Student createStudent(Student student);
}
