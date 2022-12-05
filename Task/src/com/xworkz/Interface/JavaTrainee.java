package com.xworkz.Interface;

import com.xworkz.Interface.Rules.XworkzRules;

public class JavaTrainee extends Person implements XworkzRules{

	public JavaTrainee(String name, int age) {
		super(name, age);
        System.out.println("running const...");
     }

	@Override
	public boolean uploadedTask() {
       System.out.println("Running uploaded task");	
       return false;
	}

	@Override
	public boolean completedTask() {
		System.out.println("Running completed task");
		return false;
	}

	@Override
	String eat() {
		System.out.println("Running eat");
		return null;
	}

	@Override
	boolean sleep() {
		System.out.println("Running sleep");
		return false;
	}

}
