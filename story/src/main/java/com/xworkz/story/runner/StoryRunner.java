package com.xworkz.story.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.story.dto.StoryEntity;

public class StoryRunner {
	public static void main(String[] args) {
		EntityManagerFactory eMF=Persistence.createEntityManagerFactory("xworkz");
		EntityManager eM= eMF.createEntityManager();
		EntityTransaction eT= eM.getTransaction();
		try {
			eT.begin();
			StoryEntity story=new StoryEntity();
			story.setId(6);
			story.setTitle("Shadows Beneath");
			story.setAuthor_name("Arjun Reddy");
			story.setGenre("Drama");
			story.setPublication_date("2023-03-14");
			story.setStatus("Completed");
			story.setChapters(15);
			story.setRating(4);
			story.setViews(22220);
			story.setSynopsis("A moving tale of resilience and self-discovery..");
		

			eM.persist(story);
			eT.commit();
		}catch(Exception e) 
		{
			e.printStackTrace();
			
		}
		finally {
			eM.close();
			eMF.close();
		}
	}

}
