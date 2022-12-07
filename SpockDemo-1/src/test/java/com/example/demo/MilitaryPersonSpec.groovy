package com.example.demo

import spock.lang.Specification

class MilitaryPersonSpec extends Specification {
	
	def "testimng getters and setters od MiliataryPerson"(){
		when: "petrson has first, last names and rank"
		MiliataryPerson person = new MiliataryPerson();
		person.firstName = "Renu"
		person.lastName="Sulthan"
		person.setRank("commander")
		
		then: "we get details as "
		person.createTitle("Sulthan, Renu (commander)")
		
	}
}
