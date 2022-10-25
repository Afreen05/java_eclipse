package com.xworkz.examples.boot;

import com.xworkz.examples.Flower;

public class FlowerRunner {

	public static void main(String[] args) {
		
		Flower flower=new Flower(30);
		    flower.quantity=50;
            flower.displayDetails();
            flower.totalPrice();
	}

	
	

}
