package com.example.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
   @Autowired
   StudentRepository repository;
   public Optional<Student> getStudent(int id){
	   return repository.findById(id);
   }
public String updateDetails(Student stu) {
	// TODO Auto-generated method stub
	repository.save(stu);
	return "updated";
}
public String deleteDetails(int id) {
	repository.deleteById(id);
	return "deleted";
}
}
