package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class students {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String Studentname;
	
	private String Clas;
	
	private String Section;
	
	private String Email;
	
	private String Password;
	
	private String Fathername;

	private String Mothername;
	

}
