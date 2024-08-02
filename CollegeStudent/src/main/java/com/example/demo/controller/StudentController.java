package com.example.demo.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.students;
import com.example.demo.services.Studentservice;


@RestController
@RequestMapping("/api/v1")
public class StudentController {


	// Students  SErvice  connection to controller
	
	@Autowired
	
	Studentservice service;
	
	

	//adding the students 
	

	@PostMapping("/insert")
	public students insert(@RequestBody students s) {
		
		return service.insert(s);
	}
	
	
	
	// fetch the data using Student id
	
	
	
	@GetMapping("/getbyid/{id}")
	public Optional<students> getByStudentId(@PathVariable int id) {
		
		return service.getStudentById(id);
	}
	
	
	// fetching all students data
	
	
	@GetMapping("/getall")
	public List<students> getAllStudents(){
		
		return service.getAllStudents();
	}
	
	
	// deleting student details using id

	@DeleteMapping("/delete/{id}")
	public String DeleteById(@PathVariable int id) {

        return service.DeleteById(id);
	}
	

	// updating students details using students details
	
	
	@PutMapping("/update")
	public students UpdateStudent(@RequestBody students students) {
		
		return service.updateStudent(students);
	}
}
