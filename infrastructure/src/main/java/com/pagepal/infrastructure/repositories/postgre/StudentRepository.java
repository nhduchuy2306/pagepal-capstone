package com.pagepal.infrastructure.repositories.postgre;

import com.pagepal.domain.entities.postgre.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface StudentRepository extends JpaRepository<Student, UUID> {
}
