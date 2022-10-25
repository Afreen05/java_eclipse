package com.xworkz.examples;

import com.xworkz.constants.FlowerNames;

public class Flower {
     public final String colour="Red";
     public static String type;
     public int price;
     public FlowerNames names=FlowerNames.LILLY;
     public int quantity;
     
     
	public Flower(int price) {
		this.price=price;
	}
	public void setQuantity(int quantity) {
		this.quantity=quantity;
	}
	
	static {
		Flower.type="rose";

	}
	
	public void displayDetails() {
		System.out.println(colour);
		System.out.println(type);
		System.out.println(FlowerNames.DAIZY);
		System.out.println(this.price);
		System.out.println(this.quantity);
	}
	public void totalPrice() {
		int total=this.price*this.quantity;
		System.out.println(total);
	}
     
     
     
}
