package com.xworkz.examples.boot;

import com.xworkz.examples.Mango;

public class MangoRunner {

	public static void main(String[] args) {
        
		Mango mango=new Mango(15);
		mango.price=200.50;
		mango.displayDetails();
		mango.totalPrice();
	}


}
