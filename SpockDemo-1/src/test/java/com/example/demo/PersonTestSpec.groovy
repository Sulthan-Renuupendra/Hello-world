package com.example.demo

import spock.lang.Specification

class PersonTestSpec extends Specification{
	def "testing the person getName here"(){
		when:"person full details setted as"
			Person person = new Person();
				person.setPName("Renu")
				
		then:"personn Name should match with"
		 	person.getPName()=="Renu"
	}
}
