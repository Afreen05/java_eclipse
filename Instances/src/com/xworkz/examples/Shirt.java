package com.xworkz.examples;

import com.xworkz.constants.ShirtBrands;

public class Shirt {
   public ShirtBrands brand=ShirtBrands.RAYMOND;
   public static String clothType;
   public double price;
   public boolean quality;
   public final char size='M';
   
   public Shirt(double price) {
	   this.price=price;
   }
   
   public void cloth(boolean quality) {
	   this.quality=quality;
   }
   
   static {
	   Shirt.clothType="cotton";
   }
   
   public void displayDetails() {
	   System.out.println(brand);
	   System.out.println(size);
	   System.out.println(clothType);
	   System.out.println(this.quality);
	   System.out.println(this.price);
	   
   }
   
   
}
