package com.school.management.service;

import java.util.List;
import java.util.Optional;

import com.school.management.model.StudentDTO;


public interface StudentService{

    List<StudentDTO> findAllStudents();

    void saveStudent(StudentDTO userDTO);

    String updateStudent(StudentDTO newUserDTO);

    Optional<StudentDTO> findById(Integer id);

}
