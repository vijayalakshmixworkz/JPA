package com.xworkz.mouse.Runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;
import java.util.ArrayList;
import com.xworkz.mouse.dto.Singer;

public class SingerRunner {
public static void main(String[] args) {
	EntityManagerFactory eMF = Persistence.createEntityManagerFactory("xworkz");
	EntityManager eM = eMF.createEntityManager();
	EntityTransaction eT = eM.getTransaction();
  List<Singer> s = new ArrayList<>();
  //s.add(new Singer("viji",22,"viji@gmail.com","7483381416"));
  s.add(new Singer("sapna", 14,  "sapna@gmail.com", "74833854678"));
  s.add(new Singer("gagana", 15,  "gagana@gmail.com", "748332355"));
  s.add(new Singer("sanju", 16,  "sanju@gmail.com", "7480987665"));
  s.add(new Singer ("hemanth", 23,  "hemanth@gmail.com", "74089876554"));
  s.add(new Singer ("kiran", 24, "kiran@gmail.com", "6361685270"));
  s.add(new Singer("sina", 26,  "sina@gmail.com", "6361971359"));
  s.add(new Singer("vidya", 18,  "vidya@gmail.com", "7483381416"));
  s.add(new Singer("pragu", 20,  "pragu@gmail.com", "74833098767"));
  s.add(new Singer("musta", 14, "mustaq21@gmail.com", "8660286768"));
  for(Singer sing:s) {
	  System.out.println(sing);
  }
  try {
		eT.begin();
		 for(Singer sing:s) {
	
			eM.persist(sing);
		 }
		eT.commit();
		System.out.println("singer data saved successfully");
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
