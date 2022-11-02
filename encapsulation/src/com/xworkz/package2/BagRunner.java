package com.xworkz.package2;

import com.xworkz.package1.task.Bag;
import com.xworkz.package1.task.LaptopBag;

public class BagRunner {

	public static void main(String[] args) {
          
		Bag bagIn=new Bag();
		LaptopBag laptop=new LaptopBag();
		bagIn.use(laptop);
		System.out.println(laptop.getBrand());
		

	}
	}


