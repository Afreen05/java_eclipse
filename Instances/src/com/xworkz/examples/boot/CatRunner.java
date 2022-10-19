package com.xworkz.examples.boot;

import com.xworkz.examples.Cat;

public class CatRunner {

	public static void main(String[] args) {
        
		
		String[] breed= {"persian","siamese","british_shorthair","ragdoll"};
		float[] height= {1.4f,1.3f,1.5f};
		int[] total_cats= {1,2,3,4};
		String[] food_brand= {"whiskas","drools","kennel"};
		String[] colors= {"white","black","gold"};
		char[] gender= {'f','m'};
		
		Cat cat=new Cat("persian","green",2,"white",true,breed,height,total_cats,food_brand,colors,gender);
		System.out.println(cat.type);
		System.out.println(cat.eye_color);
		System.out.println(cat.age);
		System.out.println(cat.color);
		System.out.println(cat.healthy);
		
		cat.display();
	}

}
