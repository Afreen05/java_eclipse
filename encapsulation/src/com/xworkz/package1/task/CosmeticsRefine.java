package com.xworkz.package1.task;

public class CosmeticsRefine {
    
	public void useCosmetics(Cosmetics cosmetics)
    {
		cosmetics.setBrand("mack");	
		cosmetics.setType("zehios");
		cosmetics.setBrandOwner("razak");
		cosmetics.setManufactureCountry("India");
		cosmetics.setColour("price");
		cosmetics.setManufactureDate("2022/10/07");
		cosmetics.setExpireDate("2010/10/10");
		cosmetics.setName("lipliner");
		cosmetics.setQuantity(250);
		cosmetics.setModel("reanse");
		cosmetics.setColour("red");
		
		System.out.println(cosmetics.getBrand());
		System.out.println(cosmetics.getType());
		System.out.println(cosmetics.getBrandOwner());
		System.out.println(cosmetics.getManufactureCountry());
		System.out.println(cosmetics.getColour());
		System.out.println(cosmetics.getManufactureDate());
    	System.out.println(cosmetics.getExpireDate());
    	System.out.println(cosmetics.getName());
    	System.out.println(cosmetics.getQuantity());
    	System.out.println(cosmetics.getModel());
    	System.out.println(cosmetics.getColour());
	
}
}
