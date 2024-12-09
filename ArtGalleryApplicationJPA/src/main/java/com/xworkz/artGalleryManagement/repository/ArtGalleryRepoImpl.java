package com.xworkz.artGalleryManagement.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.artGalleryManagement.entity.ArtGalleryEntity;

public class ArtGalleryRepoImpl implements ArtGalleryRepo {
	@Override
	public boolean save(ArtGalleryEntity artGalleryEntity) {
		EntityManagerFactory eMF = Persistence.createEntityManagerFactory("xworkz");
		EntityManager eM = eMF.createEntityManager();
		EntityTransaction eT = eM.getTransaction();
		System.out.println("this is repo:" + artGalleryEntity.toString());
		try {
			eT.begin();
			eM.persist(artGalleryEntity);
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
		return false;
	}
}
