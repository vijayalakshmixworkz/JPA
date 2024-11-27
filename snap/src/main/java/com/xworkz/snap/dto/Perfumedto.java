package com.xworkz.snap.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "perfume_info")
public class Perfumedto {
	@Id
	private int id;
	private String name;
	private String brand;
	private int quantity;
	private String price;
	private String fragrance_type;
	private String country_of_origin;
	private int manufacturing_year;
	private String rating;
	private int stock;
	public Perfumedto() {
		System.out.println("pefumedto connected");
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getFragrance_type() {
		return fragrance_type;
	}
	public void setFragrance_type(String fragrance_type) {
		this.fragrance_type = fragrance_type;
	}
	public String getCountry_of_origin() {
		return country_of_origin;
	}
	public void setCountry_of_origin(String country_of_origin) {
		this.country_of_origin = country_of_origin;
	}
	public int getManufacturing_year() {
		return manufacturing_year;
	}
	public void setManufacturing_year(int manufacturing_year) {
		this.manufacturing_year = manufacturing_year;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
}
