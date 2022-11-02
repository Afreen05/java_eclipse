package com.xworkz.package1.task;

public class ModifyLuggageBag {
   
	public void modifyLuggageBag(LuggageBag luggage) {
		
		luggage.setBrand("American Tourister");
		System.out.println("modified brand :"+luggage.getBrand());
		luggage.setType("BagPack");
		System.out.println("modified type :"+luggage.getType());
		luggage.setBrandOwner("stefan");
		System.out.println("modified brand owner :"+luggage.getBrandOwner());
		luggage.setColour("blue");
		System.out.println("modified colour :"+luggage.getColour());
		luggage.setFounder("Erling");
		System.out.println("modified expiry date :"+luggage.getFounder());
		luggage.setWarranty(3);
		System.out.println("modified size :"+luggage.getWarranty());
		luggage.setManufactureCountry("swedish");
		System.out.println("modified manufacture country :"+luggage.getManufactureCountry());
		luggage.setManufactureDate("2021-01-11");
		System.out.println("modified manufacture date :"+luggage.getManufactureDate());
		luggage.setPrice(6000);
		System.out.println("modified price :"+luggage.getPrice());
		luggage.setBagQuality(true);
		System.out.println("modified quality :"+luggage.isBagQuality());
		luggage.setQuantity(5);
		System.out.println("modified quantity :"+luggage.getQuantity());
	}
}
