package com.xworkz.Interface.boot;

import com.xworkz.Interface.Afreen;

public class Runner {
      
	public static void main(String[] args) {
		
	Afreen afreen=new Afreen("sam", 19);
	
	
	
	afreen.completedTask();
	afreen.uploadedTask();
	afreen.eat();
	afreen.sleep();
	afreen.gst();
	afreen.paidTax(50000d);
	
	afreen.setAge(21);
	afreen.setCollegeName("PDIT");
	afreen.setHeight(5.2);
	afreen.setName("Afreen");
	afreen.setUsn("3PG18EC025");
	
	System.out.println("AGE :"+afreen.getAge());
	System.out.println("COLLEGE NAME :"+afreen.getCollegeName());
	System.out.println("HEIGHT :"+afreen.getHeight());
	System.out.println("NAME :"+afreen.getName());
	System.out.println("USN :"+afreen.getUsn());
	
    
}
}