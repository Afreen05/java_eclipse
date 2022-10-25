package com.xworkz.examples;

import com.xworkz.constants.Select;

public class Fish {

	public String name;
	public double weight;
	public Select s = Select.TWO;
	

	public Fish(String name, double weight, Select s) {
	
		this.name = name;
		this.weight = weight;
		this.s = s;
		
	}

	public void display() {
		System.out.println(this.name);
		System.out.println(this.weight);
		System.out.println(Select.TWO.values());
		
		
	}

}
