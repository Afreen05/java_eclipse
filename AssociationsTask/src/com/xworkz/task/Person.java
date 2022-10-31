package com.xworkz.task;

public class Person {
    public String name;
    public Email[] emails;
    public Job job;
    
    public Person(String name) {
    	this.name=name;
    }
    
    public void setEmails(Email[] emails) {
    	this.emails=emails;
    }
    
    public void set(Job job) {
    	this.job=job;
    }
    
    public void displayDetails() {
    	System.out.println("Person Name :"+name);
    	
    	if(job!=null) {
    		this.job.ShowOff();
    	}
    	
    	if(this.emails!=null) {
    		for (int i = 0; i < emails.length; i++) {
    			Email mail=this.emails[i];
				if(mail!=null) {
					mail.Showoff();
				}
				else {
					System.out.println("invalid data please try again...");
				}
				
			}
    	}
    }
}
