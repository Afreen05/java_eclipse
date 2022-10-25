package com.xworkz.examples.boot;

import com.xworkz.examples.Sweet;

public class SweetRunner {

	public static void main(String[] args) {
		
		Sweet sweet=new Sweet(20);
		sweet.price=150;
		sweet.displayDetails();
		sweet.totalPrice();
		

	}

}
