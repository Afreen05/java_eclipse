package com.xworkz.examples;

public class Monuments {
	
	public String name;
	public String place;
	public String belongs_to;
	public String country;
	public double height;
	
	public String[] names;
	public String[] states;
	public String[] cities;
	public String[] kings;
	public String[] queens;
	public String[] countries;
	
	public Monuments(String name,String place,String belongs_to,String country,double height,String[] names,String[] states,String[] cities,String[] kings,String[] queens,String[] countries) {
		this.name=name;
		this.place=place;
		this.belongs_to=belongs_to;
		this.country=country;
		this.height=height;
		this.names=names;
		this.states=states;
		this.cities=cities;
		this.kings=kings;
		this.queens=queens;
		this.countries=countries;
	}
	
	public void display() {
		System.out.println(this.names);
		for (int i = 0; i < names.length; i++) {
			String ref=names[i];
			System.out.println(ref);
		}
		System.out.println(this.states);
		for (int i = 0; i < states.length; i++) {
			String ref=states[i];
			System.out.println(ref);
		}
		System.out.println(this.cities);
		for (int i = 0; i < cities.length; i++) {
			String ref=cities[i];
			System.out.println(ref);
		}
		System.out.println(this.kings);
		for (int i = 0; i < kings.length; i++) {
			String ref=kings[i];
			System.out.println(ref);
		}
		System.out.println(this.queens);
		for (int i = 0; i < queens.length; i++) {
			String ref=queens[i];
			System.out.println(ref);
		}
		System.out.println(this.countries);
		for (int i = 0; i < countries.length; i++) {
			String ref=countries[i];
			System.out.println(ref);
		}
	}

}
