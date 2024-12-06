package com.xworkz.resort.resortRunner;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import com.xworkz.resort.resortEntity.REntity;


public class ResortInsertRunner {
	public static void main(String[] args) {
		EntityManagerFactory eMF = Persistence.createEntityManagerFactory("xworkz");
		EntityManager eM = eMF.createEntityManager();
		EntityTransaction eT = eM.getTransaction();
	  List<REntity> resort = new ArrayList<>();
	  resort.add(new REntity("The Oberoi", "MG Road, Bangalore", 4.7f, 12000.50, 2000000));
	  resort.add(new REntity("Taj West End", "Race Course Road, Bangalore", 4.6f, 15000.00, 1800000));
	  resort.add(new REntity("Eagle Ridge Resort", "Bannerghatta Road, Bangalore", 4.2f, 7000.75, 800000));
	  resort.add(new REntity("Lalitha Mahal Palace Hotel", "Mysore Road, Bangalore", 4.5f, 8500.00, 1200000));
	  resort.add(new REntity("Silver Oak Farm Resort", "Kanakapura Road, Bangalore", 4.3f, 5000.25, 600000));
	  resort.add(new REntity("Vama Retreats", "Nandi Hills, Bangalore", 4.6f, 9500.00, 1500000));
	  resort.add(new REntity("Mango Forest Resort", "Hesaraghatta Lake, Bangalore", 4.4f, 6200.50, 700000));
	  resort.add(new REntity("Our Native Village", "Yelahanka, Bangalore", 4.3f, 5400.00, 750000));
	  resort.add(new REntity("Golden Palm Resort", "Hennur Bagalur Road, Bangalore", 4.8f, 13500.30, 2500000));
	  resort.add(new REntity("Windflower Prakruthi", "Off Devanahalli Road, Bangalore", 4.5f, 9000.00, 1400000));
//		 for(REntity rentity:resort) {
//			 System.out.println(rentity);
//		 }
	  try {
		eT.begin();
			 for(REntity res:resort) {
		
				eM.persist(res);
			 }
			eT.commit();
			System.out.println("resort data saved successfully");
		} catch (Exception e) {
			if (eT.isActive()) {
				System.out.println("roll back");
				eT.rollback();
				System.out.println("transaction rolled back due to error");
			}
			e.printStackTrace();

		} finally {
			eM.close();
			eMF.close();
		}
}
}
