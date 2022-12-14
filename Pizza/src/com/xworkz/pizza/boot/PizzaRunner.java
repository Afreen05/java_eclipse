package com.xworkz.pizza.boot;

import java.time.LocalDateTime;
import com.xworkz.pizza.constant.PizzaSize;
import com.xworkz.pizza.dto.PizzaDto;
import com.xworkz.pizza.service.PizzaServiceImpl;

public class PizzaRunner {

	public static void main(String[] args) {
                 
		PizzaDto pizzaDto = new PizzaDto();
		pizzaDto.setName("Queen Margharita");
		pizzaDto.setPrice(250);
		pizzaDto.setSize(PizzaSize.REGULAR);
        pizzaDto.setCheese(true);
        pizzaDto.setCompany("Pizza Hut");
        pizzaDto.setType("veg");
        pizzaDto.setToppings("olives");
        pizzaDto.setCreatedBy("Afreen");
        pizzaDto.setCreatedDate(LocalDateTime.now());
        pizzaDto.setUpdatedBy("Spoorthi");
        
        PizzaServiceImpl pizzaService = new PizzaServiceImpl();
		boolean saved = pizzaService.validateAndSave(pizzaDto);
		System.out.println(saved);
		
		
		
	}

}
