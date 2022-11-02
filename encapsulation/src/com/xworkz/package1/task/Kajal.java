package com.xworkz.package1.task;

public class Kajal {
   
	private String brand="Lakme";
	private String brandOwner="simone tata";
	private String manufactureCountry="india";
	private double price=250;
	private String manufactureDate="2022-11-27";
	private String expiryDate="2024-10-11";
	private String founder="J.R.D tata";
	private boolean quality=true;
	private int quantity=10;
	private char size ='L';
	private String colour="black";
	
	void setBrand(String brand) {
		this.brand = brand;
	}
	void setBrandOwner(String brandOwner) {
		this.brandOwner = brandOwner;
	}
	void setManufactureCountry(String manufactureCountry) {
		this.manufactureCountry = manufactureCountry;
	}
	void setPrice(double price) {
		this.price = price;
	}
	void setManufactureDate(String manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
	void setFounder(String founder) {
		this.founder = founder;
	}
	void setQuality(boolean quality) {
		this.quality = quality;
	}
	void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	void setSize(char size) {
		this.size = size;
	}
	void setColour(String colour) {
		this.colour = colour;
	}
	public String getBrand() {
		return brand;
	}
	public String getBrandOwner() {
		return brandOwner;
	}
	public String getManufactureCountry() {
		return manufactureCountry;
	}
	public double getPrice() {
		return price;
	}
	public String getManufactureDate() {
		return manufactureDate;
	}
	public String getExpiryDate() {
		return expiryDate;
	}
	public String getFounder() {
		return founder;
	}
	public boolean isQuality() {
		return quality;
	}
	public int getQuantity() {
		return quantity;
	}
	public char getSize() {
		return size;
	}
	public String getColour() {
		return colour;
	}
	
	
}
