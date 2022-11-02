package com.xworkz.package2;

import com.xworkz.package1.task.Kajal;
import com.xworkz.package1.task.KajalModify;

public class KajalRunner {

	public static void main(String[] args) {
      
		Kajal kajal=new Kajal();
		
		System.out.println("--------------old values-------------");
		System.out.println(kajal.getBrand());
		System.out.println(kajal.getExpiryDate());
		System.out.println(kajal.getBrandOwner());
		System.out.println(kajal.getColour());
		System.out.println(kajal.getPrice());
		System.out.println(kajal.isQuality());
		System.out.println(kajal.getQuantity());
		System.out.println(kajal.getManufactureDate());
		System.out.println(kajal.getManufactureCountry());
		System.out.println(kajal.getSize());
		System.out.println(kajal.getFounder());
		
		System.out.println("----------------Modified values------------------");
		KajalModify modify = new KajalModify();
		modify.ModifyKajal(kajal);
	}

}
