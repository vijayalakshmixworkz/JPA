package com.xworkz.mouse.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="singer_info")
@NamedQuery(name="findByName",query="select sing  from Singer sing where sing.name='viji'" )
@NamedQuery(name="findByAge",query="select sing  from Singer sing where sing.age=22" )
@NamedQuery(name="findByEmail",query="select sing  from Singer sing where sing.name='viji@gmail.com'" )
@NamedQuery(name="findByPhone",query="select sing  from Singer sing where sing.name='7483381416'" )
@NamedQuery(name="findById",query="select sing  from Singer sing where sing.name=2" )

public class Singer {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private int age;
	private String email ;
	private String phone_number;
	
	public Singer() {
		super();
		System.out.println("singer dto created");
	}
	
	
	public Singer(String name, int age, String email, String phone_number) {
		super();
		this.name = name;
		this.age = age;
		this.email = email;
		this.phone_number = phone_number;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	@Override
	public String toString() {
		return "Singer [id=" + id + ", name=" + name + ", age=" + age + ", email=" + email + ", phone_number="
				+ phone_number + "]";
	}
	
}
