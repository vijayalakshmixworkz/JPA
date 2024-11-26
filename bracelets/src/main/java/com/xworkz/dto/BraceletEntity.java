package com.xworkz.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "info")
public class BraceletEntity {
	@Id
	private int id;
	private String material;
	private int price;
	private String added_date;
	
	
}
