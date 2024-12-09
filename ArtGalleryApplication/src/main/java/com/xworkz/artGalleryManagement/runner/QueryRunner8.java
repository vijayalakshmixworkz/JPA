package com.xworkz.artGalleryManagement.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class QueryRunner8 {
	public static void main(String[] args) {
	    EntityManagerFactory eMF = Persistence.createEntityManagerFactory("xworkz");
	    EntityManager eM = eMF.createEntityManager();
	    EntityTransaction eT = eM.getTransaction();
	    Query query = eM.createNamedQuery("deleteByArtworkTitleAndTotalAmount");
	    query.setParameter("artworkTitle", "Timeless Beauty"); 
	    query.setParameter("totalAmount", 950000L); 
	    eT.begin();
	    int deletedRows = query.executeUpdate();
	    eT.commit();
	    System.out.println(deletedRows + " row(s) deleted.");

	    
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
