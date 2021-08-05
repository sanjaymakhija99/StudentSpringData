package com.example.crazyengg.spring.data.tutorial.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.crazyengg.spring.data.tutorial.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
