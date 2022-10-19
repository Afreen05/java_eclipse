package com.xworkz.examples;

public class Diary {
	public String branch;
	public String area_name;
	public long total_milk_packets;
	public long total_curd_packets;
	public boolean quality;
	
    public int[] quantity;
    public String[] iceCreams;
    public String[] coldDrinks;
    public String[] chocolates;
    public String[] cakes;
    
    public Diary(String branch,String area_name,long total_milk_packets,long total_curd_packets,boolean quality,int[] quantity,String[] iceCreams,String[] chocolates,String[] coldDrinks,String[] cakes)
    {
    	this.branch=branch;
    	this.area_name=area_name;
    	this.total_milk_packets=total_milk_packets;
    	this.total_curd_packets=total_curd_packets;
    	this.quality=quality;
    	this.quantity=quantity;
    	this.iceCreams=iceCreams;
    	this.coldDrinks=coldDrinks;
    	this.chocolates=chocolates;
    	this.cakes=cakes;
    }

    	
    
    public void display() {
    	System.out.println(this.quantity);
    	for (int i = 0; i < quantity.length; i++) {
			int ref=quantity[i];
			System.out.println(ref);
		}
    	System.out.println(this.iceCreams);
    	for (int i = 0; i < iceCreams.length; i++) {
			String ref=iceCreams[i];
			System.out.println(ref);
        }
    	System.out.println(this.coldDrinks);
    	for (int i = 0; i < coldDrinks.length; i++) {
			String ref=coldDrinks[i];
			System.out.println(ref);
    	}
    	System.out.println(this.chocolates);
    	for (int i = 0; i < chocolates.length; i++) {
			String ref=chocolates[i];
			System.out.println(ref);
    	}
    	System.out.println(this.cakes);
    	for (int i = 0; i < cakes.length; i++) {
			String ref=cakes[i];
			System.out.println(ref);
    }
    }
}
