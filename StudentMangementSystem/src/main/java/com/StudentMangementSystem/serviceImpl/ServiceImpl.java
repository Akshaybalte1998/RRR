package com.StudentMangementSystem.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.StudentMangementSystem.entity.Student;
import com.StudentMangementSystem.service.StudentService;


@Service
public class ServiceImpl implements StudentService{

	
	@Autowired
	com.StudentMangementSystem.repository.Studentrepository  Studentrepository;
	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		List<Student> list= Studentrepository.findAll();
		return list;
	}

}
