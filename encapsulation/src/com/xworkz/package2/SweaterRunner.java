package com.xworkz.package2;

import com.xworkz.package1.task.ModifySweater;
import com.xworkz.package1.task.Sweater;

public class SweaterRunner {

	public static void main(String[] args) {
      
		Sweater sweater=new Sweater();
		System.out.println("--------------old values-------------");
		System.out.println(sweater.getBrand());
		System.out.println(sweater.getType());
		System.out.println(sweater.getBrandOwner());
		System.out.println(sweater.getColour());
		System.out.println(sweater.getPrice());
		System.out.println(sweater.isComfy());
		System.out.println(sweater.getQuantity());
		System.out.println(sweater.getManufactureDate());
		System.out.println(sweater.getManufactureCountry());
		System.out.println(sweater.getSize());
		System.out.println(sweater.getFounder());
		
		System.out.println("----------------Modified values------------------");
		ModifySweater modify = new ModifySweater();
		modify.useSweater(sweater);
	}

}
