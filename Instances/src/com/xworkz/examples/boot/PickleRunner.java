package com.xworkz.examples.boot;

import com.xworkz.examples.Pickle;

public class PickleRunner {

	public static void main(String[] args) {
		
		String[] types= {"sweet","sour","spicy"};
		String[] color= {"red","green","brown"};
		String[] ingredients= {"oil","spices","salt","mango"};
        String[] packaging_type= {"packet","bottle","jar"};
        String[] names= {"mango","lemon","tamrind","tomato"};
        String[] expiry_date= {"2024","2022","2021"};
        
        Pickle pickle=new Pickle("swastik",150,1,true,2.5f,types,color,ingredients,packaging_type,names,expiry_date);
        System.out.println(pickle.brand);
        System.out.println(pickle.price);
        System.out.println(pickle.quantity);
        System.out.println(pickle.weight);
        System.out.println(pickle.taste);
        
        pickle.display();
	}

}
