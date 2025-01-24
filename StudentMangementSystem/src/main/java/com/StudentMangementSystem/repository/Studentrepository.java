package com.StudentMangementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.StudentMangementSystem.entity.Student;

@Repository
public interface Studentrepository  extends JpaRepository<Student, Integer> {

}
