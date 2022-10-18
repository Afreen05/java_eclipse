package com.xworkz.examples;

public class FilmActors {
	
	
boolean famous=true;
String nationality="indian";
int box_office=2;
int no_of_films_completed=100;
String  net_worth="5593 crore";

String[] bollywood= {"shahrukh khan","salman khan","amitabh bacchan","ranbir kapoor"};
String[] tollywood= {"mahesh babu","allu arjun","NTR","vijay devarkonda"};
String[] hollywood= {"tom cruise","will smith","chris hemsworth","matt damon"};
String[] kollywood= {"rajinikanth","vijay","kamal hassan","suriya"};
String[] mollywood= {"mohanlal","dileep","mammootty","nivin pauly"};

           
 public void display() {
	 System.out.println(this.famous);
	 System.out.println(this.nationality);
	 System.out.println(this.box_office);
	 System.out.println(this.no_of_films_completed);
	 System.out.println(this.net_worth);
	 
       System.out.println(this.bollywood);
       for (int i = 0; i < bollywood.length; i++) {
		String ref=bollywood[i];
		System.out.println(ref);
	}
       System.out.println(this.hollywood);
       for (int i = 0; i < hollywood.length; i++) {
		String ref=hollywood[i];
		System.out.println(ref);
       }
       System.out.println(this.tollywood);
       for (int i = 0; i < tollywood.length; i++) {
		String ref=tollywood[i];
		System.out.println(ref);
       }
       System.out.println(this.mollywood);
       for (int i = 0; i < mollywood.length; i++) {
		String ref=mollywood[i];
		System.out.println(ref);
       }
       System.out.println(this.kollywood);
       for (int i = 0; i < kollywood.length; i++) {
		String ref=kollywood[i];
		System.out.println(ref);
       }
 }
	
}
