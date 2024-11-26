package com.xworkz.webtoon.dto;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "webtoon_info")
public class WebEntity {
@Id
	private int	id; 
	private String title; 
	private String author_name;
	private String genre;
	private String release_date; 
	private String status;
	private int total_episodes; 
	private int rating; 
	private int views; 
	private String description; 
	public int getId() {
		return id;
	}
	public WebEntity() {
		System.out.println(" web entity connected");
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor_name() {
		return author_name;
	}
	public void setAuthor_name(String author_name) {
		this.author_name = author_name;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getRelease_date() {
		return release_date;
	}
	public void setRelease_date(String release_date) {
		this.release_date = release_date;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getTotal_episodes() {
		return total_episodes;
	}
	public void setTotal_episodes(int total_episodes) {
		this.total_episodes = total_episodes;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public int getViews() {
		return views;
	}
	public void setViews(int views) {
		this.views = views;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	
}
