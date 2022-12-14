package com.xworkz.pizza.service;

import com.xworkz.pizza.dto.PizzaDto;

public interface PizzaService {
   
       boolean validateAndSave(PizzaDto dto);
}
