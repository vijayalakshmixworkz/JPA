package com.xworkz.resort.resortEntity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="resort_info")
@NamedQuery(name="findAll",query="select re from REntity re")
@NamedQuery(name="findById",query="select re.resort_name from REntity re where re.id= : byId")
@NamedQuery(name="findByName",query="select re.rating from REntity re where re.resort_name= : byName")
@NamedQuery(name="findByRating", query="select re.cost_per_night from REntity re where re.rating= : byRating")
@NamedQuery(name="findRevenue", query="select re.total_revenue from REntity re where re.location= : Location")
@NamedQuery(name="findByLocation", query="select re.id from REntity re where re.location= : byLocation")

public class REntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String resort_name;
    private String location;
    private float rating;
    private double cost_per_night;
    private long total_revenue;

    public REntity() {
    	System.out.println(" resort entity created");
    }
   
	public REntity(String resort_name, String location, float rating, double cost_per_night, long total_revenue) {
		super();
		this.resort_name = resort_name;
		this.location = location;
		this.rating = rating;
		this.cost_per_night = cost_per_night;
		this.total_revenue = total_revenue;
	}

	@Override
	public String toString() {
		return "REntity [id=" + id + ", resort_name=" + resort_name + ", location=" + location + ", rating=" + rating
				+ ", cost_per_night=" + cost_per_night + ", total_revenue=" + total_revenue + "]";
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getResort_name() {
		return resort_name;
	}

	public void setResort_name(String resort_name) {
		this.resort_name = resort_name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public double getCost_per_night() {
		return cost_per_night;
	}

	public void setCost_per_night(double cost_per_night) {
		this.cost_per_night = cost_per_night;
	}

	public long getTotal_revenue() {
		return total_revenue;
	}

	public void setTotal_revenue(long total_revenue) {
		this.total_revenue = total_revenue;
	}

    

    
    }
