package com.pagepal.application.mappers;

import com.pagepal.application.dtos.StudentDto;
import com.pagepal.domain.entities.postgre.Student;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface StudentMapper {
    StudentMapper INSTANCE = Mappers.getMapper(StudentMapper.class);

    StudentDto toDto(Student student);

    Student toEntity(StudentDto studentDto);
}
