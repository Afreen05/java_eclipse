package com.xworkz.task;

public class Job {
    
	public String role;
	public double salary;
	public boolean bond;
	public Company company;
	
	public Job(String role, double salary, boolean bond) {
		this.role = role;
		this.salary = salary;
		this.bond = bond;
	}
	
	public void set(Company company) {
		this.company=company;
	}
	
	public void ShowOff() {
		System.out.println("Job Role :"+role);
		System.out.println("Salary :"+salary);
		System.out.println("Bond :"+bond);
		 if(company!=null) {
			 this.company.ShowOff();
		 }
	}
	
	
}
