package com.school.management.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.management.model.StudentDTO;
import com.school.management.repository.StudentRepository;
import com.school.management.service.StudentService;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<StudentDTO> findAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public void saveStudent(StudentDTO studentDTO) {
        studentRepository.save(studentDTO);
    }

    @Override
    public String updateStudent(StudentDTO updateStudentDTO) {
        String msg;

        if(updateStudentDTO.getId() != 0){
            studentRepository.save(updateStudentDTO);
            msg = "Data updated";
        }else {
            msg = "Error";
        }

        return msg;
    }

    @Override
    public Optional<StudentDTO> findById(Integer id) {
        return studentRepository.findById(id);
    }
}
