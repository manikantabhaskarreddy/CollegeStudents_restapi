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

import com.example.demo.models.marks;
import com.example.demo.services.Marksservice;

@RestController

@RequestMapping("/api/v1")
public class MarksController {

	
	// Marks  Dao  connection to controller
	
	@Autowired
	
	Marksservice service;
	
	
	
	//adding the students marks
	
	@PostMapping("/addmarks")
	public marks AddMarks(@RequestBody marks m) {
		
		return service.AddMarks(m);
	}
	
	
	// fetch the data using Student id
	
	
	@GetMapping("/getbymark/{id}")
	public Optional<marks> getMarksById(@PathVariable int id) {
		
		return service.getByMarkId(id);
	}
	
	
	// fetching all students marks data
	
	@GetMapping("/allmarks")
	public List<marks> getAllMarks(){
		
		
		return service.getAllMarks();
	}
	
	
	// deleting student marks details using id
	
	
	@DeleteMapping("/marksdelete/{id}")
	public String deletemarks(@PathVariable int id) {
		
		return service.deletemarks(id);
	}
	
	
	// updating marks using marks details  
	
	
	@PutMapping("/updatemark")
	public marks updatemarks(@RequestBody marks m) {
		
		return service.updatemarks(m);
	}
	
}
