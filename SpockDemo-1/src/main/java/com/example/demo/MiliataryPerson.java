package com.example.demo;

import lombok.Data;

@Data
public class MiliataryPerson {
	private String firstName;
	private String lastName;
	private String rank;

	public String createTitle(){
		return lastName+", "+firstName +" ("+rank+")";
	} 
}
