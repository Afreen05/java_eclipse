package com.xworkz.task;

public class City {
	   public String cityName;
	   public int noOfItCompanies;
	   public long population;
	   public final int pincode=560004;
	   
	  public City(String cityName, int noOfItCompanies, long population) {
		this.cityName = cityName;
		this.noOfItCompanies = noOfItCompanies;
		this.population = population;
	}
	   public void ShowOff() {
		   System.out.println("City Name :"+this.cityName);
		   System.out.println("noOfItCompanies :"+this.noOfItCompanies);
		   System.out.println("population :"+this.population);
		   System.out.println("pincode :"+pincode);
	   }
	   
	}
