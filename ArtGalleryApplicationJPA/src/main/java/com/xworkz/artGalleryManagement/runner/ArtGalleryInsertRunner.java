//package com.xworkz.artGalleryManagement.runner;
//
//public class ArtGalleryInsertRunner {
//
//}
package com.xworkz.artGalleryManagement.runner;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.artGalleryManagement.entity.ArtGalleryEntity;

public class ArtGalleryInsertRunner {
	public static void main(String[] args) {
		EntityManagerFactory eMF = Persistence.createEntityManagerFactory("xworkz");
		EntityManager eM = eMF.createEntityManager();
		EntityTransaction eT = eM.getTransaction();

		List<ArtGalleryEntity> artGallery = new ArrayList<>();
		artGallery.add(
				new ArtGalleryEntity("The Serene Landscape", "Ravi Kumar", "Ananya Gupta", LocalDate.of(2024, 12, 1),
						LocalDateTime.of(2024, 12, 1, 14, 30), 150000.75f, 1500000L, true, "ART001"));
		artGallery.add(new ArtGalleryEntity("Eternal Beauty", "Meera Singh", "Rajesh Patel", LocalDate.of(2024, 11, 10),
				LocalDateTime.of(2024, 11, 10, 10, 0), 200000.50f, 2000000L, true, "ART002"));
		artGallery.add(
				new ArtGalleryEntity("Abstract Expressions", "Vikram Sharma", "Rani Verma", LocalDate.of(2024, 10, 25),
						LocalDateTime.of(2024, 10, 25, 16, 45), 120000.00f, 1200000L, false, "ART003"));
		artGallery.add(new ArtGalleryEntity("Modernistic Elegance", "Anjali Desai", "Sanjay Rao",
				LocalDate.of(2024, 9, 20), LocalDateTime.of(2024, 9, 20, 12, 0), 175000.25f, 1750000L, true, "ART004"));
		artGallery.add(new ArtGalleryEntity("Timeless Beauty", "Deepak Choudhury", "Neha Kapoor",
				LocalDate.of(2024, 8, 15), LocalDateTime.of(2024, 8, 15, 9, 30), 95000.00f, 950000L, true, "ART005"));
		artGallery.add(new ArtGalleryEntity("Joyous Harmony", "Suresh Kumar", "Priya Nair", LocalDate.of(2024, 7, 30),
				LocalDateTime.of(2024, 7, 30, 11, 15), 135000.50f, 1350000L, false, "ART006"));
		artGallery.add(new ArtGalleryEntity("Golden Horizon", "Arun Bhagat", "Shalini Joshi", LocalDate.of(2024, 6, 10),
				LocalDateTime.of(2024, 6, 10, 13, 0), 160000.75f, 1600000L, true, "ART007"));
		artGallery.add(new ArtGalleryEntity("The Vibrant Mosaic", "Kavitha Singh", "Ajay Mehta",
				LocalDate.of(2024, 5, 5), LocalDateTime.of(2024, 5, 5, 15, 30), 130000.25f, 1300000L, true, "ART008"));
		artGallery
				.add(new ArtGalleryEntity("Whimsical Delight", "Priya Yadav", "Vikram Singh", LocalDate.of(2024, 4, 12),
						LocalDateTime.of(2024, 4, 12, 17, 0), 110000.50f, 1100000L, false, "ART009"));
		artGallery.add(new ArtGalleryEntity("Ethereal Dream", "Mohan Kumar", "Geeta Iyer", LocalDate.of(2024, 3, 28),
				LocalDateTime.of(2024, 3, 28, 8, 45), 140000.75f, 1400000L, true, "ART010"));

		for (ArtGalleryEntity entity : artGallery) {
			System.out.println(entity);
		}

		try {
			eT.begin();
			for (ArtGalleryEntity art : artGallery) {
				eM.persist(art);
			}
			eT.commit();
			System.out.println("Art gallery transaction data saved successfully.");
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
