package com.xworkz.examples.boot;

import com.xworkz.constants.Select;
import com.xworkz.examples.Fish;

public class FishRunner {

	public static void main(String[] args) {
		
		Fish fish=new Fish("goldFish",1555.0,Select.TWO);
		fish.display();
		
		System.out.println(Select.ONE);
		
	}

}
