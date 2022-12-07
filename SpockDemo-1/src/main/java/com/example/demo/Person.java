package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {

	private String pName;
	private String pCity;
	private int pId;

	public String personDetails() {
		return "pName";
	}
}