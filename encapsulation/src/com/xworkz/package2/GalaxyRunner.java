package com.xworkz.package2;

import com.xworkz.package1.task.Galaxy;
import com.xworkz.package1.task.GalaxyRefine;

public class GalaxyRunner {

	Galaxy galaxy =new Galaxy();
	GalaxyRefine refine = new GalaxyRefine();
    {
      System.out.println(GalaxyRefine.largestGalaxy);
      System.out.println(galaxy.getName());
      System.out.println(galaxy.getNamesOfPlanet());
		System.out.println(galaxy.getNoOfCountryInPlanets());
		System.out.println(galaxy.getPlanetSpeciality());
		System.out.println(galaxy.getNoOfCountryInPlanets());
		System.out.println(galaxy.getBirthOfGalaxy());
		System.out.println(galaxy.getYongestGalaxy());
		System.out.println(galaxy.getRareGalaxy());
		System.out.println(galaxy.getBrightestGalaxy());
		
		System.out.println("****");
      System.out.println(galaxy.getName());
      refine.useGalaxy(galaxy);
	}
}

		
	


