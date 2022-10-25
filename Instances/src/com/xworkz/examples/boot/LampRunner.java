package com.xworkz.examples.boot;

import com.xworkz.examples.Lamp;

public class LampRunner {

	public static void main(String[] args) {
      
		Lamp lamp=new Lamp(1500.50);
		lamp.weight=15.5;
		lamp.displayDetails();
	}

}
