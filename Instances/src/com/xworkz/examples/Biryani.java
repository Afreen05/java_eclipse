package com.xworkz.examples;

public class Biryani {
	
	public String type;
	public boolean nonveg;
	public boolean taste;
	public int price;
	public int quantity;
		
	public String[] ingredients;
	public String[]  color;
	public String[] types;
	public String[] names;
	public boolean[] quality;
	public String[] spices_used;
	
	public Biryani(String type,boolean nonVeg,boolean taste,int price,int quantity,String[] ingredients,String[] color,String[] types,String[] names,boolean[] quality,String[] spices_used ){
		
		this.type=type;
		this.nonveg=nonVeg;
		this.taste=taste;
		this.price=price;
		this.quantity=quantity;
		this.ingredients=ingredients;
		this.color=color;
		this.types=types;
		this.names=names;
		this.quality=quality;
		this.spices_used=spices_used;
	}
	
	public void display() {
		System.out.println(this.ingredients);
		for (int i = 0; i < ingredients.length; i++) {
			String ref=ingredients[i];
			System.out.println(ref);
		}
		System.out.println(this.color);
		for (int i = 0; i < color.length; i++) {
			String ref=color[i];
			System.out.println(ref);
		}
		System.out.println(this.types);
		for (int i = 0; i < types.length; i++) {
			String ref=types[i];
			System.out.println(ref);
		}
		System.out.println(this.names);
		for (int i = 0; i < names.length; i++) {
			String ref=names[i];
			System.out.println(ref);
		}
		System.out.println(this.quality);
		for (int i = 0; i < quality.length; i++) {
			boolean ref=quality[i];
			System.out.println(ref);
		}
		System.out.println(this.spices_used);
		for (int i = 0; i < spices_used.length; i++) {
			String ref=spices_used[i];
			System.out.println(ref);
		}
	}

}
