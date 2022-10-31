package com.xworkz.task;

public class Company {
    public String companyName;
    public String ownerName;
    public Address address;
    public Location location;
    
    public Company(String companyName,String ownerName) {
    	this.companyName=companyName;
    	this.ownerName=ownerName;
    }
    	public void set(Address address,Location location) {
    		this.address=address;
    		this.location=location;
    	}
    	
    	public void ShowOff() {
    		System.out.println("company name :"+companyName);
    		System.out.println("Owner Name :"+ownerName);
    		
    		if(address!=null) {
    			this.address.ShowOff();
    		}
    		if(location!=null) {
    			this.location.ShowOff();
    		}
    	}
}
