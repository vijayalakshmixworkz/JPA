package com.xworkz.snap.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.snap.dto.Ringdto;

public class SnapRunner {
	public static void main(String[] args) {
		EntityManagerFactory eMF = Persistence.createEntityManagerFactory("xworkz");
		EntityManager eM = eMF.createEntityManager();
		EntityTransaction eT = eM.getTransaction();
 Integer id=1;
	Ringdto ring = eM.find(Ringdto.class, id);
System.out.println("ring name="+ring.getMaterial());
		try {
			eT.begin();
			
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

