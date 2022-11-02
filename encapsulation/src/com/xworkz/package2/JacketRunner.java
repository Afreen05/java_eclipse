package com.xworkz.package2;

import com.xworkz.package1.task.Jacket;
import com.xworkz.package1.task.JacketModify;

public class JacketRunner {

	public static void main(String[] args) {
		       
			Jacket jack=new Jacket();
			
			System.out.println("--------------old values-------------");
			System.out.println(jack.getBrand());
			System.out.println(jack.getType());
			System.out.println(jack.getBrandOwner());
			System.out.println(jack.getColour());
			System.out.println(jack.getPrice());
			System.out.println(jack.isClothQuality());
			System.out.println(jack.getQuantity());
			System.out.println(jack.getManufactureDate());
			System.out.println(jack.getManufactureCountry());
			System.out.println(jack.getSize());
			System.out.println(jack.getFounder());
			
			System.out.println("----------------Modified values------------------");
			JacketModify modify = new JacketModify();
			modify.useJacket(jack);
			
		}

	}


