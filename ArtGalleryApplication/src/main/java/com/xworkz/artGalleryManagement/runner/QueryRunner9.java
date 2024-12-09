package com.xworkz.artGalleryManagement.runner;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.NamedQuery;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.artGalleryManagement.entity.ArtGalleryEntity;

public class QueryRunner9 {
	public static void main(String[] args) {
		EntityManagerFactory eMF = Persistence.createEntityManagerFactory("xworkz");
		EntityManager eM = eMF.createEntityManager();
		EntityTransaction eT = eM.getTransaction();
		Query query = eM.createNamedQuery("updateByOwnerNameAndTotalAmount");
		query.setParameter("ownerName", "Ananya Gupta");
		query.setParameter("currentTotalAmount", 1500000L);
		query.setParameter("newTotalAmount", 2000000L);
		eT.begin();
		int rowsUpdated = query.executeUpdate();
		eT.commit();
		System.out.println(rowsUpdated + " row(s) updated.");

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
