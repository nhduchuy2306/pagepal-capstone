package com.pagepal.webapi.repositories;

import com.pagepal.domain.entities.Student;
import com.pagepal.infrastructure.repositories.postgre.StudentRepository;
import com.pagepal.webapi.WebapiApplication;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.UUID;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {WebapiApplication.class})
public class StudentRepositoryTest {

    @Autowired
    private StudentRepository studentRepository;

    private final Logger LOG = org.slf4j.LoggerFactory.getLogger(StudentRepositoryTest.class);

    @Before
    public void setUp() {
        studentRepository.save(
                new Student(UUID.randomUUID(), "John", "john@gmail.com", "12345", "0123456789", "HCM" )
        );
        studentRepository.save(
                new Student(UUID.randomUUID(), "Mary", "mary@gmail.com", "12345", "0123456789", "HCM" )
        );
    }

    @Test
    public void testFindAll() {
        var list = studentRepository.findAll();
        LOG.info("list: {}", list);
        assert list.size() == 2;
    }
}
