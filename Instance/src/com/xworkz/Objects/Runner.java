package com.xworkz.Objects;

import com.xworkz.Objects.*;

public class Runner {

	public static void main(String[] args) {
		
		Bus ref=new Bus();
		ref.busNum=24;
		System.out.println(ref.busNum);
		
		Bus ref1=new Bus();
		ref1.starting="hospet";
		System.out.println(ref1.starting);
		
		Bus ref3=new Bus();
		ref3.destination="bangalore";
		System.out.println(ref3.destination);
		
		System.out.println(" ");
		
		DistrictCollector dc=new DistrictCollector();
		dc.name="pavan kumar";
		System.out.println(dc.name);
		
		DistrictCollector dc1=new DistrictCollector();
		dc1.age=40;
		System.out.println(dc1.age);
		
		DistrictCollector dc2=new DistrictCollector();
		dc2.district="vijaynagar";
		System.out.println(dc2.district);
		
		DistrictCollector dc3=new DistrictCollector();
		dc3.batchNumber="2005";
		System.out.println(dc3.batchNumber);
		
		System.out.println("");
		
		Chocolate choco1=new Chocolate();
		choco1.name="Fererro Rocher";
		System.out.println(choco1.name);
		
		Chocolate choco2=new Chocolate();
		choco2.brand="Nutella";
		System.out.println(choco2.brand);
		
		Chocolate choco3=new Chocolate();
		choco3.price=500d;
		System.out.println(choco3.price);
		
		Chocolate choco4=new Chocolate();
		choco4.flavour="Chocolate";
		System.out.println(choco4.flavour);
		
		Chocolate choco5=new Chocolate();
		choco5.flavour="Hazelnut";
		System.out.println(choco5.flavour);
		
		System.out.println(" ");
		
		Song reff=new Song();
		reff.name="Kesariya";
		System.out.println(reff.name);
		
		Song reff1=new Song();
		reff1.language="Hindi";
		System.out.println(reff1.language);
		
		Song reff2=new Song();
		reff2.singer="Arijit Singh";
		System.out.println(reff2.singer);
		
		Song reff3=new Song();
		reff3.writer="Amitabh Bhattacharya";
		System.out.println(reff3.writer);
		
		Song reff4=new Song();
		reff4.type="love";
		System.out.println(reff4.type);
		
		System.out.println(" ");
		
		Developer patience=new Developer();
		patience.developerName="Ijaz";
		System.out.println(patience.developerName);
		
		Developer patience1=new Developer();
		patience1.education="B.E";
		System.out.println(patience1.education);
		
		Developer patience2=new Developer();
		patience2.experience=3;
		System.out.println(patience2.experience);
		
		Developer patience3=new Developer();
		patience3.salary=35000;
		System.out.println(patience3.salary);
		
		Developer patience4=new Developer();
		patience4.company="Accenture";
		System.out.println(patience4.company);
	}

}
