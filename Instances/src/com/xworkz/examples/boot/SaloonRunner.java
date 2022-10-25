package com.xworkz.examples.boot;

import com.xworkz.examples.Saloon;

public class SaloonRunner {

	public static void main(String[] args) {
        
		Saloon saloon=new Saloon(112);
		saloon.shopAddress="rajaji nagar";
		saloon.displayDetails();
		
	}
}

