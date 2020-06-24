package com.example.batchprocessing;

import javax.persistence.*;

@Entity
public class Person {

	@Id
	@GeneratedValue
	private Long id;

	private String lastName;
	private String firstName;

	public Person() {
	}

	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "firstName: " + firstName + ", lastName: " + lastName;
	}

}
