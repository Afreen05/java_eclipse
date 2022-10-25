package com.xworkz.examples.boot;

import com.xworkz.examples.Milk;

public class MilkRunner {

	public static void main(String[] args) {
     
		Milk milk=new Milk(10);
		milk.price=12;
		milk.displayDetails();
		milk.totalPrice();
	}

}
