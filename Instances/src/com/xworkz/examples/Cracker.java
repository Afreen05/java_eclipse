package com.xworkz.examples;

import com.xworkz.constants.CrackerBrands;

public class Cracker {
     
	public String name="phuljhari";
	public static String type;
	public int price;
	public double quantity;
	public CrackerBrands brand=CrackerBrands.ELEPHANT;
     
	public Cracker(String name,double quantity) {
		this.name=name;
		this.quantity=quantity;		
	}
	static {
		Cracker.type="soda crackers";
	}
	public void displayDetails() {
		System.out.println(this.name);
		System.out.println(type);
		System.out.println(this.brand);
		int price=150;
		System.out.println(price);
		System.out.println(this.quantity);
		
	}
	public void totalPrice() {
		double total=this.price*this.quantity;
		System.out.println(total);
		
	}
	
}
