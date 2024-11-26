package com.xworkz.airpod.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "airpod_info")
public class AirpodEntity {
	@Id
	private int id;
	private String model_name;
	private String brand;
	private String release_date;
	private int battery_life;
	private String noise_cancellation;
	private String bluetooth_version;
	private int price;
	private int stock_count;
	private String description;

	public AirpodEntity() {
		System.out.println("AirpodEntity is connected");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getModel_name() {
		return model_name;
	}

	public void setModel_name(String model_name) {
		this.model_name = model_name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getRelease_date() {
		return release_date;
	}

	public void setRelease_date(String release_date) {
		this.release_date = release_date;
	}

	public int getBattery_life() {
		return battery_life;
	}

	public void setBattery_life(int battery_life) {
		this.battery_life = battery_life;
	}

	public String getNoise_cancellation() {
		return noise_cancellation;
	}

	public void setNoise_cancellation(String noise_cancellation) {
		this.noise_cancellation = noise_cancellation;
	}

	public String getBluetooth_version() {
		return bluetooth_version;
	}

	public void setBluetooth_version(String bluetooth_version) {
		this.bluetooth_version = bluetooth_version;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getStock_count() {
		return stock_count;
	}

	public void setStock_count(int stock_count) {
		this.stock_count = stock_count;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
