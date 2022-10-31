package com.xworkz.task;

public class Country {
    public String countryName;
    public double population;
    public String topSoftwareCompany;
    public String noOfSoftwareEngineers;
    
	public Country(String countryName, double population, String topSoftwareCompany, String noOfSoftwareEngineers) {
		this.countryName = countryName;
		this.population = population;
		this.topSoftwareCompany = topSoftwareCompany;
		this.noOfSoftwareEngineers = noOfSoftwareEngineers;
	}
    
    public void ShowOff() {
    	System.out.println("Country Name :"+this.countryName);
    	System.out.println("population :"+this.population);
    	System.out.println("Top IT Company in Bangalore :"+this.topSoftwareCompany);
    	System.out.println("Number of software developers in India"+this.noOfSoftwareEngineers);
    	
    }
}
