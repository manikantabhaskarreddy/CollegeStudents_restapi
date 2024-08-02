package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.students;
import com.example.demo.repository.StudentRepository;

@Service
public class Studentservice {

	@Autowired
	
	StudentRepository repo;
	
	
	//inserting students in students table
	
	public students insert(students s) {
		
		return repo.save(s);
	}
	
	
	
	// fetching students using students id from database
	
	
	
	public Optional<students> getStudentById(int id) {
		
		return repo.findById(id);
	}
	
	

	// fetching all students using students id from database
	
	
	public List<students> getAllStudents(){
		
		return repo.findAll();
	}
	
	
	// deleting students using id from database
	
	
	public String DeleteById(Integer id) {
		
		repo.deleteById(id);
		
		return "Successfully  deleted : "+id;
	}
	
	
	
	// updating marks using id from database
	
	
    public students updateStudent(students students) {
    	
    	int id = students.getId();
    	
    	students std = repo.findById(id).get();
    	
    	std.setStudentname(students.getStudentname());
    	std.setSection(students.getSection());
    	std.setClas(students.getClas());
    	std.setEmail(students.getEmail());
    	std.setPassword(students.getPassword());
    	std.setFathername(students.getFathername());
        std.setMothername(students.getMothername());
        
        return repo.save(std);

}
}
