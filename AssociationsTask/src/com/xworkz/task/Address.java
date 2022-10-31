package com.xworkz.task;

public class Address {
    
	public final String areaName="White field";
	public Location location;
	
	public void set(Location location) {
		this.location=location;
	}
	
	public void ShowOff() {
		System.out.println("Area Name :"+areaName);
		
		if(location!=null) {
			this.location.ShowOff();
		}
	}
	
	
}
