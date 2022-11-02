package com.xworkz.package2;

import com.xworkz.package1.task.Cosmetics;
import com.xworkz.package1.task.CosmeticsRefine;

public class CosmeticsRunner {
    
	public static void main(String[] args) {
	Cosmetics index=new Cosmetics();
    System.out.println(index.getBrand());
    System.out.println(index.getType());
    System.out.println(index.getBrandOwner());
    System.out.println(index.getManufactureCountry());
    System.out.println(index.getColour());
	System.out.println(index.getManufactureDate());
	System.out.println(index.getName());
	System.out.println(index.getExpireDate());
	System.out.println(index.getQuantity());	
	System.out.println(index.getModel());
	System.out.println(index.getColour());
	
	System.out.println("*****");
	CosmeticsRefine refine = new CosmeticsRefine();
	refine.useCosmetics(index);
	
}
}
