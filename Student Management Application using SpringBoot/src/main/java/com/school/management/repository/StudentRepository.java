package com.school.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.school.management.model.StudentDTO;

public interface StudentRepository extends JpaRepository<StudentDTO, Integer> {
}
