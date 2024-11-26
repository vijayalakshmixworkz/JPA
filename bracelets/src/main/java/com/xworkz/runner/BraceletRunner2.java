package com.xworkz.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.dto.BraceletEntity;

public class BraceletRunner2 {
public static void main(String[] args) {
	EntityManagerFactory eMF=Persistence.createEntityManagerFactory("xworkz");
	EntityManager eM=eMF.createEntityManager();
	EntityTransaction eT= eM.getTransaction();
	


	try {
		eT.begin();
		BraceletEntity braceletEntity= eM.find(BraceletEntity.class, 2);	
		eM.remove(braceletEntity);

		eT.commit();
	} catch (Exception e) {
		e.printStackTrace();

	} finally {
		eM.close();
		eMF.close();
	}
}
}














//BraceletEntity bc1= new BraceletEntity(2,"plastic",100,"20");
	//BraceletEntity bc2= new BraceletEntity(3,"plastic",100,"20");
	//BraceletEntity bc3= new BraceletEntity(4,"plastic",100,"20");	
	//BraceletEntity bc4= new BraceletEntity(5,"plastic",100,"20");
	//BraceletEntity bc5= new BraceletEntity(6,"plastic",100,"20");
	//BraceletEntity bc6= new BraceletEntity(7,"plastic",100,"20");
	//BraceletEntity bc7= new BraceletEntity(8,"plastic",100,"20");
	//BraceletEntity bc8= new BraceletEntity(9,"plastic",100,"20");
	//BraceletEntity bc9= new BraceletEntity(10,"plastic",100,"20");
//eM.persist(bc1);
		//eM.persist(bc2);
		//eM.persist(bc3);
		//eM.persist(bc4);
		//eM.persist(bc5);
		//eM.persist(bc6);
		//eM.persist(bc7);
		//eM.persist(bc8);
		//eM.persist(bc9);
		
