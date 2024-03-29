
package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
  @Autowired
  StudentRepository servicerepository;
  @Autowired
  StudentService service;
  
  @GetMapping("/getValues")
  List<Student> getList(){
	  return servicerepository.findAll();
  }
  @PostMapping("/post")
  public Student create(@RequestBody Student stu) {
	  return servicerepository.save(stu);
  }
  @GetMapping("/getValues/{id}")
	  public Optional<Student> getbyId(@PathVariable int id)
	  {
	  return service.getStudent(id);
	  }
  @PutMapping("/student")
  public String update(@RequestBody Student stu)
  {
	  return service.updateDetails(stu);
  }
  @DeleteMapping("/student")
  public String delete(@RequestParam int id)
		  {
			  return service.deleteDetails(id);
		  }
}

















