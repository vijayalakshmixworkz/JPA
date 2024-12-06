package com.xworkz.snap.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.snap.dto.Ringdto;

public class RingRunner {
	public static void main(String[] args) {
		EntityManagerFactory eMF = Persistence.createEntityManagerFactory("xworkz");
		EntityManager eM = eMF.createEntityManager();
		EntityTransaction eT = eM.getTransaction();

		try {
			eT.begin();
			Ringdto ring = new Ringdto();
			ring.setId(10);
			ring.setMaterial("Platinum");
			ring.setSize(7);
			ring.setWeight("5.0");
			ring.setPrice("120000.00");
			ring.setColor("Silver");
			ring.setDesign("Intricate");
			ring.setManufacturer("Tanishq");
			ring.setManufactured_year(2021);
			ring.setStock_quantity(20);

			eM.persist(ring);
			eT.commit();
		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			eM.close();
			eMF.close();
		}

	}
}
