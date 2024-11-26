package com.xworkz.story.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.story.dto.StoryDTO;

public class StoryRunner2 {
public static void main(String[] args) {
	EntityManagerFactory eMF=Persistence.createEntityManagerFactory("xworkz");
	EntityManager eM=eMF.createEntityManager();
	EntityTransaction eT= eM.getTransaction();
	try {
		eT.begin();
		StoryDTO dto=new StoryDTO();
		dto.setId(7);
		dto.setTitle("Beneath the Moonlight");
		dto.setAuthor_name("Kavya Sharma");
		dto.setGenre("Romance");
		dto.setPublication_date("2023-02-14");
		dto.setStatus("Completed");
		dto.setChapters(18);
		dto.setRating(5);
		dto.setViews(40000);
		dto.setSynopsis("A heartwarming story of love and destiny");
		eM.merge(dto);
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
