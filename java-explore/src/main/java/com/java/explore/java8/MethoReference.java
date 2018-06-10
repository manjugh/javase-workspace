package com.java.explore.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Method reference provide better readability for Labmda expression which calls existing method of an objects. 
 * There are 4 variants in the Method reference
 * 1. Static method reference
 * 2. Instance method reference
 * 3. Method reference of particular object type
 * 4. Constructor reference.
 */
public class MethoReference {

	public static void main(String[] args) {
		List<User> users = new ArrayList<>();
		
		for(int i=0; i<10;i++) {
			users.add(new User("userName"+i, "firstname"+i, 2*i));
		}
		
		// Static method reference
		users.stream().map(MethoReference::prepareCompleteName).forEach(System.out::print);
		
		// Instance Method reference;
		users.stream().map(User::getAge).forEach(System.out::print);
		
		//	ContainingType::methodName
		users.stream().map(User::getFirstname).filter(String::isEmpty).count();
		
		//Reference to a constructor
		
	}
	
	public static String prepareCompleteName(User u) {
		return u.getUserName()+u.getFirstname();
	}
	
}

class User {
	
	private String userName, firstname;
	
	private int age;

	public User(String userName, String firstname, int age) {
		super();
		this.userName = userName;
		this.firstname = firstname;
		this.age = age;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}
