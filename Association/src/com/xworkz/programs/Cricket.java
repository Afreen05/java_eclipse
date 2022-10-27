package com.xworkz.programs;

public class Cricket {
     
	public String[] indiaTeam;
	public String oppositionTeam="England";
	public boolean won=true;
	
	public Cricket(String[] indiaTeam) {
		this.indiaTeam=indiaTeam;
	}
	
	public void showoff() {
		System.out.println(this.oppositionTeam);
		System.out.println(won);
		
		System.out.println(this.indiaTeam);
		for (int i = 0; i < indiaTeam.length; i++) {
			String ref=indiaTeam[i];
			System.out.println(ref);
		}
	}
}
