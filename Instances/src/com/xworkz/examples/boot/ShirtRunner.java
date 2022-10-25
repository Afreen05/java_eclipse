package com.xworkz.examples.boot;

import com.xworkz.examples.Shirt;

public class ShirtRunner {

	public static void main(String[] args) {
        Shirt shirt=new Shirt(1240.55);
        shirt.quality=true;
        shirt.displayDetails();
	}

}
