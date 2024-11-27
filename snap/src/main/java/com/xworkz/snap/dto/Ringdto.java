package com.xworkz.snap.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ring_info")
public class Ringdto {
	@Id
	private int id;
	   private String material;
	    private int size;
	    private String weight;
	    private String price;
	    private String color;
	    private String design;
	    private String manufacturer;
	    private int  manufactured_year;
	    private int stock_quantity ;
	    public Ringdto() {
	    	System.out.println("ring dto connected");
	    }
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getMaterial() {
			return material;
		}
		public void setMaterial(String material) {
			this.material = material;
		}
		public int getSize() {
			return size;
		}
		public void setSize(int size) {
			this.size = size;
		}
		public String getWeight() {
			return weight;
		}
		public void setWeight(String weight) {
			this.weight = weight;
		}
		public String getPrice() {
			return price;
		}
		public void setPrice(String price) {
			this.price = price;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public String getDesign() {
			return design;
		}
		public void setDesign(String design) {
			this.design = design;
		}
		public String getManufacturer() {
			return manufacturer;
		}
		public void setManufacturer(String manufacturer) {
			this.manufacturer = manufacturer;
		}
		public int getManufactured_year() {
			return manufactured_year;
		}
		public void setManufactured_year(int manufactured_year) {
			this.manufactured_year = manufactured_year;
		}
		public int getStock_quantity() {
			return stock_quantity;
		}
		public void setStock_quantity(int stock_quantity) {
			this.stock_quantity = stock_quantity;
		}

}
