package com.xworkz.examples.boot;

import com.xworkz.examples.Biryani;

public class BiryaniRunner {

	public static void main(String[] args) {
		
		String[] ingredients= {"rice","chicken","onion","oil","gingerGarlicPaste","water","biryaniMasala","curd"};
		String[] names= {"hyderabadi","lucknow","bellary"};
		String[] types= {"dumm","akhni","tahari"};
		String[] color= {"red","yellow"};
		boolean[] quality= {true,false,true};
		String[] spices_used= {"garam masala","elaichi","laung","blackpepper"};
		
		Biryani biryani=new Biryani("dumm",true,true,110,1,ingredients,names,types,color,quality,spices_used);
		System.out.println(biryani.type);
		System.out.println(biryani.quantity);
		System.out.println(biryani.taste);
		System.out.println(biryani.nonveg);
		System.out.println(biryani.price);
		
		biryani.display();
		

	}

}
