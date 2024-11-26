package com.xworkz.webtoon.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.webtoon.dto.WebEntity;

public class WebRunner {
	public static void main (String args[])
	{
	EntityManagerFactory eMF= Persistence.createEntityManagerFactory("webtoon");
	EntityManager eM=eMF.createEntityManager();
	EntityTransaction eT= eM.getTransaction();
	try {
		eT.begin();
		WebEntity web = new WebEntity();
		web.setId(1);
		web.setTitle("Eternal Shadows");
		web.setAuthor_name("Ramesh Iyer");
		web.setGenre("Fantasy");
		web.setRelease_date("2023-01-15");
		web.setStatus("Ongoing");
		web.setTotal_episodes(34);
		web.setRating(5);
		web.setViews(1500);
		web.setDescription("A thrilling tale of a world where shadows come to life.");
	
		eM.persist(web);
		eT.commit();
	//1, 'Eternal Shadows', 'Ramesh Iyer', 'Fantasy',
	//	'2023-01-15', 'Ongoing', 34, 5, 150000,
	//	'A thrilling tale of a world where shadows come to life.'),	
	}
	catch(Exception e) 
	{
		e.printStackTrace();
		
	}
	finally {
		eM.close();
		eMF.close();
	}
	}

}
