package com.xworkz.programs.boot;

import com.xworkz.programs.Cricket;

public class Runner {
    
	String[] indiaTeam= {"kohli","K L Rahul","chahal","Ashwin","Rohit"};
	
	Cricket crick=new Cricket(indiaTeam); {
		crick.showoff();
		System.out.println(crick.indiaTeam);
	}
}
