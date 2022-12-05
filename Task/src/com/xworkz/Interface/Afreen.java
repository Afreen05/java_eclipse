package com.xworkz.Interface;

public class Afreen extends JavaTrainee implements KarnatakaRTO{

	public Afreen(String name, int age) {
		super(name, age);
        System.out.println("running const...");
      }

	@Override
	public boolean paidTax(double amount) {
		return KarnatakaRTO.super.paidTax(amount);
	}

	@Override
	public double gst() {
		return KarnatakaRTO.super.gst();
	}

	@Override
	public boolean uploadedTask() {
		return super.uploadedTask();
	}

	@Override
	public boolean completedTask() {
		return super.completedTask();
	}

	@Override
	public
	String eat() {
		return super.eat();
	}

	@Override
	public
	boolean sleep() {
		return super.sleep();
	}
     
	
	
}
