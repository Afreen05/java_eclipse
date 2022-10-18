package com.xworkz.examples.boot;

import com.xworkz.examples.Cosmetics;

public class CosmeticsRunner{ 


	public static void main(String[] args) {
		Cosmetics cosmetic=new Cosmetics();
		System.out.println(cosmetic.price);
		System.out.println(cosmetic.type);
		System.out.println(cosmetic.quality);
		System.out.println(cosmetic.expiryDate);
		
		cosmetic.display();
		
		
	}

}
