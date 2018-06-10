package com.java.explore.java8;

import java.util.Optional;

public class OptionalExample {

	public static void main(String[] args) {
		//Simple Example
		Optional<String> opt = Optional.empty();
		String defaultValue = opt.orElse("No value");
		System.out.println("defaultValue "+defaultValue);
		
		//Complex examples
		Employee emp = new Employee();
		emp.setAddress(Optional.empty());
		Optional<Employee> e = Optional.ofNullable(emp);
		String state = e.flatMap(Employee::getAddress).map(Address::getState).orElse("unknown");
		
		System.out.println("state "+state);
	}
	
}

class Employee{
	private String name;
	
	private Optional<Address> address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Optional<Address> getAddress() {
		return address;
	}

	public void setAddress(Optional<Address> address) {
		this.address = address;
	}
	
}

class Address{
	
	private String city;
	
	private String state;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	
}

