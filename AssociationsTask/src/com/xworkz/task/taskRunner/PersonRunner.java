package com.xworkz.task.taskRunner;

import com.xworkz.task.Address;
import com.xworkz.task.City;
import com.xworkz.task.Company;
import com.xworkz.task.Country;
import com.xworkz.task.Email;
import com.xworkz.task.Job;
import com.xworkz.task.Location;
import com.xworkz.task.Person;
import com.xworkz.task.State;

public class PersonRunner {

	public static void main(String[] args) {
     Person person=new Person("Afreen");
     Job job=new Job("software developer", 25000, true);
     Company company=new Company("Bosch", "Robert Bosch");
     Country country=new Country("india", 1.417, "TCS", "2.75 million");
     State state=new State("Karnataka", 66165886, 31, 30);
     City city=new City("Bangalore", 67000, 13193035);
     Location locate=new Location(177,"4th");
     Address address=new Address();
     
     locate.set(country, state, city);
     company.set(address, locate);
     job.set(company);
     person.set(job);
     
     Email mail1=new Email ("afzaafreen04@gmail.com","afreen123",636354364l);
     Email mail2=new Email ("afza@gmail.com","afza123",986457655l);
     Email mail3=new Email ("afreen.xworkz@gmail.com","afreen@123",786546554l);
        
     Email[] ids= {mail1,mail2,mail3};
     person.setEmails(ids);
     person.displayDetails();

     
	}

}
