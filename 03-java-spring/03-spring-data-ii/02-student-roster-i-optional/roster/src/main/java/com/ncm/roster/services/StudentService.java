package com.ncm.roster.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ncm.roster.models.Student;
import com.ncm.roster.repositories.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
		
	private StudentRepository studentRepo;



	public List<Student> allStudents(){
		return studentRepo.findAll();
	}
	
	public Student createStudent(Student newStudent) {
		return studentRepo.save(newStudent);
		
	}
	
}
