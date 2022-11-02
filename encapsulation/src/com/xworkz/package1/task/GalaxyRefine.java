package com.xworkz.package1.task;

public class GalaxyRefine {
     
	public static String largestGalaxy="IC 1011";
    public Galaxy galaxy;
    
    public void useGalaxy(Galaxy galaxy)
    {
    	galaxy.setNoOfPlanets(10);
    	
    	System.out.println(galaxy.getName());
    	System.out.println(galaxy.getNamesOfPlanet());
    	System.out.println(galaxy.getNoOfCountryInPlanets());
    	System.out.println(galaxy.getPlanetSpeciality());
    	System.out.println(galaxy.getNoOfCountryInPlanets());
    	System.out.println(galaxy.getBirthOfGalaxy());
    	System.out.println(galaxy.getYongestGalaxy());
    	System.out.println(galaxy.getRareGalaxy());
    	System.out.println(galaxy.getBrightestGalaxy());
    
    }
}

