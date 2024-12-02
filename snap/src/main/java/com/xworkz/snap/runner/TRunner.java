package com.xworkz.snap.runner;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import antlr.collections.List;
import com.xworkz.snap.dto.TrainerDto;

public class TRunner {
public static void main(String[] args) {
	EntityManagerFactory eMF = Persistence.createEntityManagerFactory("xworkz");
	EntityManager eM = eMF.createEntityManager();
	EntityTransaction eT = eM.getTransaction();
List<TrainerDto> trainer =new ArrayList<>();

	try {
		eT.begin();
		eM.persist(trainer);
		eT.commit();
	} catch (Exception e) {
		e.printStackTrace();

	} finally {
		eM.close();
		eMF.close();
}
}
