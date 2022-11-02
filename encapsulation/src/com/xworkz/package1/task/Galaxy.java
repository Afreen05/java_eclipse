package com.xworkz.package1.task;

public class Galaxy {
    
	
		private String name="MilkyWay";
		private String namesOfPlanet="sun";
		public String[] types={"spiral", "elliptical", "peculiar","irregular"};
		public int noOfPlanets=12;
		private String planetSpeciality="living home";
		private double noOfCountryInPlanets=123785;
		private float birthOfGalaxy=13.61f;
		private String rareGalaxy="ring";
		private String yongestGalaxy="GN-Z11";
		private String brightestGalaxy="andomeda";
		
		public String getName() {
			return name;
		}
		void setName(String name) {
			this.name = name;
		}
		public String getNamesOfPlanet() {
			return namesOfPlanet;
		}
		void setNamesOfPlanet(String namesOfPlanet) {
			this.namesOfPlanet = namesOfPlanet;
		}
		public String[] getTypes() {
			return types;
		}
		void setTypes(String[] types) {
			this.types = types;
			for(int i=0;i<=types.length;i++) {
				this.getTypes();
			}
		}
		public int getNoOfPlanets() {
			return noOfPlanets;
		}
		void setNoOfPlanets(int noOfPlanets) {
			this.noOfPlanets = noOfPlanets;
		}
		public String getPlanetSpeciality() {
			return planetSpeciality;
		}
		void setPlanetSpeciality(String planetSpeciality) {
			this.planetSpeciality = planetSpeciality;
		}
		public double getNoOfCountryInPlanets() {
			return noOfCountryInPlanets;
		}
		void setNoOfCountryInPlanets(int noOfCountryInPlanets) {
			this.noOfCountryInPlanets = noOfCountryInPlanets;
		}
		public float getBirthOfGalaxy() {
			return birthOfGalaxy;
		}
		void setBirthOfGalaxy(float birthOfGalaxy) {
			this.birthOfGalaxy = birthOfGalaxy;
		}
		public String getRareGalaxy() {
			return rareGalaxy;
		}
		void setRareGalaxy(String rareGalaxy) {
			this.rareGalaxy = rareGalaxy;
		}
		public String getYongestGalaxy() {
			return yongestGalaxy;
		}
		void setYongestGalaxy(String yongestGalaxy) {
			this.yongestGalaxy = yongestGalaxy;
		}
		public String getBrightestGalaxy() {
			return brightestGalaxy;
		}
		void setBrightestGalaxy(String brightestGalaxy) {
			this.brightestGalaxy = brightestGalaxy;
		}
		
	}

