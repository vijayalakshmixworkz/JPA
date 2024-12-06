package com.xworkz.snap.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.snap.dto.Perfumedto;

public class PerfumeRunner {
	public static void main(String[] args) {
		EntityManagerFactory eMF = Persistence.createEntityManagerFactory("xworkz");
		EntityManager eM = eMF.createEntityManager();
		EntityTransaction eT = eM.getTransaction();

		try {
			eT.begin();
			Perfumedto perfume = new Perfumedto();
			perfume.setId(10);
			perfume.setName("Zen Spirit");
			perfume.setBrand("Calvin Klein");
			perfume.setQuantity(100);
			perfume.setPrice("799.50");
			perfume.setFragrance_type("Aromatic");
			perfume.setCountry_of_origin("Italy");
			perfume.setManufacturing_year(2022);
			perfume.setRating("4.5");
			perfume.setStock(150);
			
			eM.persist(perfume);
			eT.commit();
		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			eM.close();
			eMF.close();
		}

	}
}
