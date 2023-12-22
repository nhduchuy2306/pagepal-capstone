package com.pagepal.application.services.impl;

import com.pagepal.application.services.StudentService;
import com.pagepal.domain.entities.postgre.Student;
import com.pagepal.infrastructure.repositories.postgre.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Optional<Student> getStudentById(UUID id) {
        return studentRepository.findById(id);
    }

    @Override
    public Student createStudent(Student student) {
        UUID id = UUID.randomUUID();
        student.setId(id);
        return studentRepository.save(student);
    }
}
