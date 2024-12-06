package com.xworkz.snap.dto;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;

@Entity
@Table(name = "trainer_info")
@Setter
@Getter
public class TrainerDto {
	
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="name",nullable=false)
	private String name;
	
	@Column(name="age",nullable=false,unique=true)
	private int age;
	
	@Column(name="specialization",nullable=false)
	private String specialization;
	
	@Column(name="email",nullable=false,unique=true)
	private String email;
	
	@Column(name="phone_number",nullable=false,unique=true)
	private String phone_number;
	
	public TrainerDto() {
		super();
	}
	public TrainerDto(int id,String name, int age, String specialization, String email, String phone_number) {
		super();
		this.id=id;
		this.name = name;
		this.age = age;
		this.specialization = specialization;
		this.email = email;
		this.phone_number = phone_number;
	}
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public int getAge() {
//		return age;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}
//	public String getSpecialization() {
//		return specialization;
//	}
//	public void setSpecialization(String specialization) {
//		this.specialization = specialization;
//	}
//	public String getEmail() {
//		return email;
//	}
//	public void setEmail(String email) {
//		this.email = email;
//	}
//	public String getPhone_number() {
//		return phone_number;
//	}
//	public void setPhone_number(String phone_number) {
//		this.phone_number = phone_number;
//	}	
	
}
