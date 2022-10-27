package com.xworkz.programs;

public class Stadium {
   
	public String name;
	public String country="Dubai";
	public String location;
	public Cricket cricket=new Cricket();	
	public Stadium(String name, String country, String location) {
		this.name = name;
		this.country = country;
		this.location = location;
	}
	
	public void showOff() {
		System.out.println(this.country);
		System.out.println(this.name);
		System.out.println(this.location);
		cricket.showoff();
		System.out.println(cricket.indiaTeam);
	}
	
	
	
}
