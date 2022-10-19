package com.xworkz.examples.boot;

import com.xworkz.examples.Bags;

public class BagsRunner {

	public static void main(String[] args) {
		
		
		String[] brands= {"zara","lv","gucci"};
		int[] quantity= {1,2,3};
		String[] colors= {"red","black"};
		char[] sizes= {'s','m','l'};
		String[] available= {"flipkart","amazon"};
		

		Bags bags=new Bags("handbag",4500,3.5f,"leather",true,brands,quantity,colors,sizes,available);

 	    
 	    bags.display();
		
		
		

	}

}
