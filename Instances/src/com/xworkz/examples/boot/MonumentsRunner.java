package com.xworkz.examples.boot;

import com.xworkz.examples.Monuments;

public class MonumentsRunner {

	public static void main(String[] args) {
		
		String[] names= {"taj mahal","charminar","golgumbaz"};
		String[] states= {"karnataka","telengana"};
		String[] cities= {"hyderabad","agra","bijapur"};
		String[] kings= {"tippu sultan","chamraja odeyar","shahjahan"};
		String[] queens= {"mumtaz","elizebeth",};
		String[] countries= {"india","UK"};

		Monuments monument=new Monuments("taj","hyderabad","nizams","india",777.43,names,states,cities,kings,queens,countries);
		System.out.println(monument.name);
		System.out.println(monument.place);
		System.out.println(monument.belongs_to);
		System.out.println(monument.country);
		System.out.println(monument.height);
		monument.display();
	}

}
