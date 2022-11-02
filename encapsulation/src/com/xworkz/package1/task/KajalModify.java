package com.xworkz.package1.task;

public class KajalModify {
	
    public void ModifyKajal(Kajal kajal) {
		
        kajal.setBrand("Nykaa");
		System.out.println("modified brand :"+kajal.getBrand());
		kajal.setExpiryDate("2025-11-22");
		System.out.println("modified type :"+kajal.getExpiryDate());
		kajal.setBrandOwner("falguni nayar");
		System.out.println("modified brand owner :"+kajal.getBrandOwner());
		kajal.setColour("blue");
		System.out.println("modified colour :"+kajal.getColour());
		kajal.setFounder("falguni");
		System.out.println("modified expiry date :"+kajal.getFounder());
		kajal.setSize('S');
		System.out.println("modified size :"+kajal.getSize());
		kajal.setManufactureCountry("india");
		System.out.println("modified manufacture country :"+kajal.getManufactureCountry());
		kajal.setManufactureDate("2021-01-11");
		System.out.println("modified manufacture date :"+kajal.getManufactureDate());
		kajal.setPrice(220);
		System.out.println("modified price :"+kajal.getPrice());
		kajal.setQuality(true);
		System.out.println("modified quality :"+kajal.isQuality());
		kajal.setQuantity(10);
		System.out.println("modified quantity :"+kajal.getQuantity());
		}
	}

  

