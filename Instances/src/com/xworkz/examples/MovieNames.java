package com.xworkz.examples;


import com.xworkz.constants.Movie;

public class MovieNames {
	
	public String name;
	public String heroName;
	public int age;
	public  Movie m=Movie.PUSHPA;
	
	public MovieNames(String name,String heroName,int age,Movie m) {
		this.name=name;
		this.heroName=heroName;
		this.age=age;
		this.m=m;
		
		}
	public void show() {
		System.out.println(this.name);
		System.out.println(this.heroName);
		System.out.println(this.age);
		
		System.out.println(Movie.KGF.name);
		System.out.println(Movie.PUSHPA.ordinal());

	}
	
	
}
