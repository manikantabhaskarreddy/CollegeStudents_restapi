package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.marks;
import com.example.demo.repository.MarksRepository;

@Service
public class Marksservice {
	
	@Autowired
	
	MarksRepository repo;
	
	//inserting marks in marks table
	
	public marks AddMarks(marks m) {
		
		double Totalmarks = m.getMaths()+m.getEnglish()+m.getJava()+m.getAds()+m.getSpm()+m.getPython();
		
		m.setTotalmarks(Totalmarks);
		
		int Percentage = (int) ((Totalmarks/600)*100);
		
		m.setPercentage(Percentage);
		
		return repo.save(m);
	}
	
	// fetching marks using marks id from database
	
	
		public Optional<marks> getByMarkId(int id) {
			
			return repo.findById(id);
		}
		
	// fetching all marks using marks id from database
		
		public List<marks> getAllMarks(){
			
			return (List<marks>) repo.findAll();
		}
		
		// deleting marks using id from database
		
		
		public String deletemarks(int id) {
			
			 repo.deleteById(id);
		
			 return "Successfully deleted : "+id;
		}
		
		// updating marks using id from database
		
		
		public marks updatemarks(marks m) {
			
			int id = m.getId();
			
			marks ms = repo.findById(id).get();
			
			ms.setMaths(m.getMaths());
			ms.setEnglish(m.getEnglish());
			ms.setJava(m.getJava());
			ms.setAds(m.getAds());
			ms.setSpm(m.getSpm());
			ms.setPython(m.getPython());
			ms.setTotalmarks(m.getMaths()+m.getEnglish()+m.getJava()+m.getAds()+m.getSpm()+m.getPython());
			
			int Percentage = (int) ((ms.getTotalmarks()/600)*100);
			
			ms.setPercentage(Percentage);
			
			return repo.save(ms);
		}

}
