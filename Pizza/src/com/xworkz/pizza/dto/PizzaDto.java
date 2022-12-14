package com.xworkz.pizza.dto;

import java.time.LocalDateTime;

import com.xworkz.pizza.constant.PizzaSize;

public  class PizzaDto extends AbstractAuditDto {
           
	private String name;
	private String company;
	private PizzaSize size;
	private boolean cheese;
	private double price;
	private String type;
	private String toppings;
	
	public PizzaDto() {
		super();
	}

	public PizzaDto(String name, String company, PizzaSize size, 
			boolean cheese, double price, String type,
			String toppings,String createdBy,String updatedBy,LocalDateTime createdDate,LocalDateTime updatedDate) {
		
		super(createdBy,updatedBy,createdDate,updatedDate);
		
		this.name = name;
		this.company = company;
		this.size = size;
		this.cheese = cheese;
		this.price = price;
		this.type = type;
		this.toppings = toppings;
	}

	@Override
	public String toString() {
		return "PizzaDto [name=" + name + ", company=" + company + ", size=" + size + ", cheese=" + cheese + ", price="
				+ price + ", type=" + type + ", toppings=" + toppings + "]";
	}

	public String getName() {
		return name;
	}

	public String getCompany() {
		return company;
	}

	public PizzaSize getSize() {
		return size;
	}

	public boolean isCheese() {
		return cheese;
	}

	public double getPrice() {
		return price;
	}

	public String getType() {
		return type;
	}

	public String getToppings() {
		return toppings;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public void setSize(PizzaSize size) {
		this.size = size;
	}

	public void setCheese(boolean cheese) {
		this.cheese = cheese;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setToppings(String toppings) {
		this.toppings = toppings;
	}
	
	
	
}
