package com.xworkz.examples.boot;

import com.xworkz.examples.Bags;

public class BagsRunner {

	public static void main(String[] args) {
	  Bags bags=new Bags();
	
		String[] brands= {"zara","gucci","bata","LV"};
		int[] quantity= {1,2,3,4,5};
		String[] colors= {"brown","blue","pink"};
		char[] sizes= {'s','m','l'};
		String[] available= {"amazon","flipkart","myntra","ajio"};
		
		System.out.println(brands);
		System.out.println(quantity);
		System.out.println(colors);
		System.out.println(sizes);
 	    System.out.println(available);
 	    
 	    bags.display();
		
		
		

	}

}
