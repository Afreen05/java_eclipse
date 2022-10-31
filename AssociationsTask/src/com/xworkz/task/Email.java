package com.xworkz.task;

public class Email {
    public String id;
    public String password;
    public long mobileNo;
    public Company company;
    
    
	public Email(String id, String password, long mobileNo) {
		this.id = id;
		this.password = password;
		this.mobileNo = mobileNo;
	}
	
	public void set(Company company) {
		this.company=company;
	}
	
	public void Showoff() {
		System.out.println(" Email id :"+id);
		System.out.println("Email password :"+password);
		System.out.println("contact number :"+mobileNo);
		
		if(company!=null) {
			this.company.ShowOff();
		}
	}
    
    
}
