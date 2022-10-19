package com.xworkz.examples;

public class Pickle {
	public String brand;
	public int price;
	public int quantity;
	public boolean taste;
	public float weight;
	
	public String[] types;
	public String[] color;
	public String[] ingredients;
	public String[] packaging_type;
	public String[] names;
	public String[] expiry_date;
	
	public Pickle(String brand,int price,int quantity,boolean taste,float weight,String[] types,String[] color,String[] ingredients,String[] packaging_type,String[] names,String[] expiry_date) {
	
       this.brand=brand;
       this.price=price;
       this.quantity=quantity;
       this.taste=taste;
       this.weight=weight;
       this.types=types;
       this.color=color;
       this.ingredients=ingredients;
       this.packaging_type=packaging_type;
       this.names=names;
       this.expiry_date=expiry_date;
}
	
	public void display() {
		System.out.println(this.types);
		for (int i = 0; i < types.length; i++) {
			String ref=types[i];
			System.out.println(ref);
		}
		System.out.println(this.color);
		for (int i = 0; i < color.length; i++) {
			String ref=color[i];
			System.out.println(ref);
		}
		System.out.println(this.ingredients);
		for (int i = 0; i < ingredients.length; i++) {
			String ref=ingredients[i];
			System.out.println(ref);
		}
		System.out.println(this.packaging_type);
		for (int i = 0; i < packaging_type.length; i++) {
			String ref=packaging_type[i];
			System.out.println(ref);
		}
		System.out.println(this.names);
		for (int i = 0; i < names.length; i++) {
			String ref=names[i];
			System.out.println(ref);
		}
		System.out.println(this.expiry_date);
		for (int i = 0; i < expiry_date.length; i++) {
			String ref=expiry_date[i];
			System.out.println(ref);
		}
	}
}