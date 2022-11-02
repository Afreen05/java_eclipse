package com.xworkz.package1.task;

public class ModifySweater {
  
	public void useSweater(Sweater sweater) {
		
		sweater.setBrand("Mango");
		System.out.println("modified brand :"+sweater.getBrand());
		sweater.setType("cardigan");
		System.out.println("modified type :"+sweater.getType());
		sweater.setBrandOwner("isac andic");
		System.out.println("modified brand owner :"+sweater.getBrandOwner());
		sweater.setColour("maroon");
		System.out.println("modified colour :"+sweater.getColour());
		sweater.setFounder("nahman");
		System.out.println("modified expiry date :"+sweater.getFounder());
		sweater.setSize('S');
		System.out.println("modified size :"+sweater.getSize());
		sweater.setManufactureCountry("catalonia");
		System.out.println("modified manufacture country :"+sweater.getManufactureCountry());
		sweater.setManufactureDate("2021-01-11");
		System.out.println("modified manufacture date :"+sweater.getManufactureDate());
		sweater.setPrice(15000);
		System.out.println("modified price :"+sweater.getPrice());
		sweater.setComfy(true);
		System.out.println("modified quality :"+sweater.isComfy());
		sweater.setQuantity(1);
		System.out.println("modified quantity :"+sweater.getQuantity());
}
}
