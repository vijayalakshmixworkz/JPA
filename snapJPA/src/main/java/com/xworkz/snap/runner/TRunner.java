package com.xworkz.snap.runner;

import java.util.List;
import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.snap.dto.TrainerDto;

public class TRunner {
	public static void main(String[] args) {
		EntityManagerFactory eMF = Persistence.createEntityManagerFactory("xworkz");
		EntityManager eM = eMF.createEntityManager();
		EntityTransaction eT = eM.getTransaction();
		TrainerDto t=new TrainerDto(1,"viji", 22, "BE", "viji@gmail.com", "7483381416");
//		List<TrainerDto> trainer = new ArrayList<>();
//		trainer.add(new TrainerDto("viji", 22, "BE", "viji@gmail.com", "7483381416"));
//		trainer.add(new TrainerDto("sapna", 14, "BCA", "sapna@gmail.com", "74833854678"));
//		trainer.add(new TrainerDto("gagana", 15, "Mcom", "gagana@gmail.com", "748332355"));
//		trainer.add(new TrainerDto("sanju", 16, "Bcom", "sanju@gmail.com", "7480987665"));
//		trainer.add(new TrainerDto("hemanth", 23, "Bsc", "hemanth@gmail.com", "74089876554"));
//		trainer.add(new TrainerDto("kiran", 24, "Bba", "kiran@gmail.com", "6361685270"));
//		trainer.add(new TrainerDto("sina", 26, "BE", "sina@gmail.com", "6361971359"));
//		trainer.add(new TrainerDto("vidya", 18, "Bsc", "vidya@gmail.com", "7483381416"));
//		trainer.add(new TrainerDto("pragu", 20, "Bba", "pragu@gmail.com", "74833098767"));
//		trainer.add(new TrainerDto("musta", 14, "MBA", "mustaq21@gmail.com", "8660286768"));
//		for (TrainerDto tr : trainer) {
//			System.out.println(tr);
//		}
		try {
			eT.begin();
//			System.out.println("Begin ");
//			for (TrainerDto tr : trainer) {
//				System.out.println("Begin "+tr);
				
				eM.persist(t);
//			}
			eT.commit();
			System.out.println("trainer data saved successfully");
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
