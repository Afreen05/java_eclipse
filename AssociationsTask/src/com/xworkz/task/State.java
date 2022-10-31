package com.xworkz.task;

public class State {
	public String nameOfState;
	public long population;
    public int noOfDistricts;
    public int noOftaluks;
    
	public State(String nameOfState, long population, int noOfDistricts, int noOftaluks) {
		this.nameOfState = nameOfState;
		this.population = population;
		this.noOfDistricts = noOfDistricts;
		this.noOftaluks = noOftaluks;
	}
	
	public void ShowOff() {
		System.out.println("name of the state :"+this.nameOfState);
		System.out.println("population"+this.population);
		System.out.println("number of districts :"+this.noOfDistricts);
		System.out.println("number of taluks :"+this.noOftaluks);
	}
    
   
}
