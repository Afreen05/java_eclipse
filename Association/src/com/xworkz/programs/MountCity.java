package com.xworkz.programs;

import com.xworkz.constants.MountainNames;

public class MountCity {
     public String countryName="india";
     public String stateName;
     public double area;
     public int totalNoOfMountains;
     public Mountain mount=new Mountain();
     
     
	public MountCity(String stateName, double area, int totalNoOfMountains) {
		this.stateName = stateName;
		this.area = area;
		this.totalNoOfMountains = totalNoOfMountains;
	}
	
	public void showoff() {
		System.out.println(countryName);
		System.out.println(this.stateName);
		System.out.println(this.area);
		System.out.println(this.totalNoOfMountains);
		System.out.println(mount.height);
		System.out.println(mount.location);
		System.out.println(MountainNames.HIMALAYAS);
	}
     
     
}
