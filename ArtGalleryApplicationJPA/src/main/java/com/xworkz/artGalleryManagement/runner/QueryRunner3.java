package com.xworkz.artGalleryManagement.runner;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class QueryRunner3 {
	public static void main(String[] args) {
	    EntityManagerFactory eMF = Persistence.createEntityManagerFactory("xworkz");
	    EntityManager eM = eMF.createEntityManager();
	    EntityTransaction eT = eM.getTransaction();
	    Query query = eM.createNamedQuery("countGroupByArtworkTitleAndTransactionDate");
	    List<Object[]> results = query.getResultList();
	    for (Object[] result : results) {
	        System.out.println("Artwork Title: " + result[0] + ", Transaction Date: " + result[1] + ", Count: " + result[2]);
	    }

	    
	    try {
	        eT.begin(); 
	     
	        eT.commit(); 
	        System.out.println("Art gallery transaction data fetched.");
	    } catch (Exception e) {
	        if (eT.isActive()) {
	            System.out.println("Rolling back transaction...");
	            eT.rollback();
	            System.out.println("Transaction rolled back due to error.");
	        }
	        e.printStackTrace();
	    } finally {
	        eM.close(); 
	        eMF.close(); 
	    }
	}
}
