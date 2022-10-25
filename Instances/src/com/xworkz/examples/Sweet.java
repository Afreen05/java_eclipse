package com.xworkz.examples;

import com.xworkz.constants.SweetBrands;

public class Sweet {
	
	public final String type="laddo";
	public double price;
	public int quantity;
	public static String name;
    public SweetBrands brand = SweetBrands.BIKANER;
     
	
    public Sweet(int quantity) {
		this.quantity = quantity;
	}
    
    public void setPrice(double price) {
    	this.price=price;
    }
   
	static {
		Sweet.name="kaju katli";
		
	}
	public void totalPrice() {
		double total=this.price*this.quantity;
		System.out.println(total);
		
	}
    public void displayDetails() {
    	System.out.println(Sweet.name);
    	System.out.println(this.price);
    	System.out.println(this.quantity);
    	System.out.println(brand);
    	System.out.println(this.type);
    
    }
    
    }



