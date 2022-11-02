package com.xworkz.package2;

import com.xworkz.package1.task.Cream;
import com.xworkz.package1.task.ShopName;

public class ShopNameRunner {

	public static void main(String[] args) {
         
		ShopName shop = new ShopName();
		Cream cream= new Cream();
		shop.typeCream(cream);
		System.out.println(cream.getOwner());

	}
	}


