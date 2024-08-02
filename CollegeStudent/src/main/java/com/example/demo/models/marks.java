package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class marks {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private int Maths;
	
	private int English;
	
	private int Java;
	
	private int Ads;
	
	private int Spm;
	
	private int Python;
	
	private double Totalmarks;
	
	private int Percentage;

}
