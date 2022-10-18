package com.xworkz.examples;


public class Cosmetics {
	
	public static String brand="nykaa";
	public double price=1450;
	public String type="makeup";
	public boolean quality=true;
	public String expiryDate="25-06-2023";
	
	public String[] lipStick= {"matte","gloss","creme","tint"};
	public String[] color = {"red","pink","brown"};
	public String[] lipBalm= {"mamaEarth","maybelline","nivea"};
	public String[] mascara= {"nykaa","colosal","MAC","sugar"};
	public String[] foundation={"stick","matte","cream","hd"};
	public int[] quantity={1,2,3,4,5};
	
	public Cosmetics() {
		
		System.out.println(" Entered cosmetics constructor");
		this.price=price;
		this.type=type;
		this.quality=quality;
		this.expiryDate=expiryDate;
		this.lipStick=lipStick;
		this.color=color;
		this.lipBalm=lipBalm;
		this.mascara=mascara;
		this.foundation=foundation;
		this.quantity=quantity;
	}
	
	public void display() {
		System.out.println(this.lipStick);
		System.out.println(this.color);
		System.out.println(this.lipBalm);
		System.out.println(this.mascara);
		System.out.println(this.foundation);
		System.out.println(this.quantity);
		
			for(int i=0;i<lipStick.length;i++) {
			String ref=lipStick[i];
			System.out.println(ref);
		}
			for(int j=0;j<color.length;j++) {
				String ref1=color[j];
				System.out.println(ref1);
		}
			for(int k=0;k<lipBalm.length;k++) {
				String ref2=lipBalm[k];
				System.out.println(ref2);
	}
			for(int l=0;l<mascara.length;l++) {
				String ref3=mascara[l];
				System.out.println(ref3);
			}
			for(int m=0;m<foundation.length;m++) {
				String ref4=foundation[m];
				System.out.println(ref4);
			}
			for(int n=0;n<quantity.length;n++) {
				int ref5=quantity[n];
				System.out.println(ref5);
}
}
}
