package com.school.management.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.school.management.model.StudentDTO;
import com.school.management.service.StudentService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
   private StudentService studentService;

    @GetMapping("/all")
    public List<StudentDTO> findAllStudents(){
        return studentService.findAllStudents();
    }

    @PostMapping("/save")
    public String saveStudent(@RequestBody StudentDTO studentDTO){
        studentService.saveStudent(studentDTO);
        return "Data saved";
    }

    @PutMapping("/update")
    public String updateStudent(@RequestBody StudentDTO updateStudentDTO){
        return studentService.updateStudent(updateStudentDTO);
    }

    @GetMapping("/find/{id}")
    public Optional<StudentDTO> findById(@PathVariable Integer id){
        return studentService.findById(id);
    }

}
