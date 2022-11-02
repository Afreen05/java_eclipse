package com.xworkz.package2;

import com.xworkz.package1.task.LuggageBag;
import com.xworkz.package1.task.ModifyLuggageBag;

public class LuggageBagRunner {
    
	public static void main(String[] args) {
        
		
	       
		LuggageBag luggage=new LuggageBag();
		
		System.out.println("--------------old values-------------");
		System.out.println(luggage.getBrand());
		System.out.println(luggage.getType());
		System.out.println(luggage.getBrandOwner());
		System.out.println(luggage.getColour());
		System.out.println(luggage.getPrice());
		System.out.println(luggage.isBagQuality());
		System.out.println(luggage.getQuantity());
		System.out.println(luggage.getManufactureDate());
		System.out.println(luggage.getManufactureCountry());
		System.out.println(luggage.getWarranty());
		System.out.println(luggage.getFounder());
		
		System.out.println("----------------Modified values------------------");
		ModifyLuggageBag modify = new ModifyLuggageBag();
		modify.modifyLuggageBag(luggage);
		
	}

}
