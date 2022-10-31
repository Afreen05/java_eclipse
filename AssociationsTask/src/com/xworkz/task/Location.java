package com.xworkz.task;

public class Location {
   public int streetNo;
   public String cross;
   public Country country;
   public State state;
   public City city;
   
  public Location(int streetNo, String cross) {
	this.streetNo = streetNo;
	this.cross = cross;
}
  public void set(Country country,State state,City city) {
	  this.country=country;
	  this.state=state;
	  this.city=city;
  }
  public void ShowOff() {
	  System.out.println("Street number :"+streetNo);
	  System.out.println("Cross :"+cross);
	  
	  if(this.country!=null) {
		  this.city.ShowOff();
	  }
	  
	  
	  if(this.state!=null) {
		  this.state.ShowOff();
	  }
	  
	  
	  if(this.city!=null) {
		  this.city.ShowOff();
	  }
	  
  }
   
  
}
