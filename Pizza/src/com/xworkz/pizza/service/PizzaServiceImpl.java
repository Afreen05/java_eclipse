package com.xworkz.pizza.service;

import com.xworkz.pizza.constant.PizzaSize;
import com.xworkz.pizza.dto.PizzaDto;

public class PizzaServiceImpl implements PizzaService{

	
	@Override
	public boolean validateAndSave(PizzaDto dto) {
         System.out.println("running validateAndSave..."+dto);
         
         String name=dto.getName();
         double price=dto.getPrice();
         String companyName=dto.getCompany();
         String toppings=dto.getToppings();
         PizzaSize size=dto.getSize();
         String type=dto.getType();
         
        boolean validPrice = false;
 		boolean validName = false;
 		boolean validCompanyName=false;
 		boolean validToppings=false;
 		boolean validSize=false;
 		boolean validType=false;
         
         if(name!=null && name.length()>=4 && name.length()<=20) {
        	 System.out.println("valid pizza name"+name);
         }
         else {
        	 System.err.println("invalid pizza name"+name);
         }
         
         if(price>=50 && price<=2000) {
        	 System.out.println("valid price"+price);
        	 validPrice=true;
         }
         else {
        	 System.err.println("invalid price"+price);
        	 validPrice=false;
         }
         
         if(companyName!=null && companyName.length()>=4 && 
        		 companyName.length()<=50 ) {
        	 System.out.println("valid company name "+companyName);
        	 validCompanyName=true;
         }
         else {
        	 System.err.println("invalid company name "+companyName);
        	 validCompanyName=false;
         }
         
         if(toppings!=null && toppings.length()>=5 && toppings.length()<=10) {
        	 System.out.println("toppings entered is valid.."+toppings);
        	 validToppings=true;
         }
         else {
        	 System.err.println("toppings entered is incorrect"+toppings);
        	 validToppings=false;
         }
         
         if(size!=null) {
        	 System.out.println("size is correct.."+size);
        	 validSize=true;
         }
         else {
        	 System.err.println("size is incorrect.."+size);
        	 validSize=false;
         }
         
         if(type!=null && type=="veg" || type=="nonVeg") {
        	 System.out.println("type is valid.."+type);
        	 validType=true;
         }
         else {
        	 System.err.println("type is invalid.."+type);
        	 validType=false;
         }
         
		
		if(validName && validPrice && validCompanyName &&
				validToppings && validSize && validType) {
        	 System.out.println("pizza dto is valid..");
        	 return true;
         }
		
		else {
			System.out.println("pizza dto is invalid");
			return false;
        
	}
		
		
		
	}
}
