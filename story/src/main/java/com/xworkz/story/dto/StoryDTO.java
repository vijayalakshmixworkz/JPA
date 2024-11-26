package com.xworkz.story.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="story_info")
public class StoryDTO {
	@Id
	private int id; ;
	private String title;;
	private String author_name ;
	private String  genre ;
	private String publication_date;
	private String status;
	int chapters;
    private int rating;
    private int views ;
    private String synopsis;
    public void StoryDTO() {
    	System.out.println("story DTo connected");
    }
	public int getId() {
		return id;
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
	public String getPublication_date() {
		return publication_date;
	}
	public void setPublication_date(String publication_date) {
		this.publication_date = publication_date;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getChapters() {
		return chapters;
	}
	public void setChapters(int chapters) {
		this.chapters = chapters;
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
	public String getSynopsis() {
		return synopsis;
	}
	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}
    

}
