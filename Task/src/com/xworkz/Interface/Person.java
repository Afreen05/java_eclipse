package com.xworkz.Interface;

public abstract class Person {
	
       private String name;
       private int age;
       private String usn;
       private double height;
       private String collegeName;
       
       
	abstract String  eat(); 
	abstract boolean sleep();
	
	
	//using constructor
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		
		
		System.out.println(this.name);
		System.out.println(this.age);
	}
	
	//using methods(encapsulation)
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getUsn() {
		return usn;
	}
	public double getHeight() {
		return height;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setUsn(String usn) {
		this.usn = usn;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	
	
}
