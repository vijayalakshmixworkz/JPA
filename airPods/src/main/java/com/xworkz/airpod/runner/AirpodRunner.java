package com.xworkz.airpod.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import com.xworkz.airpod.dto.AirpodEntity;

public class AirpodRunner {
	public static void main(String[] args) {
		EntityManagerFactory eMF=Persistence.createEntityManagerFactory("xworkz");
		EntityManager eM=eMF.createEntityManager();
		EntityTransaction eT= eM.getTransaction();
		try {
			eT.begin();
			AirpodEntity air = new AirpodEntity();
			air.setId(1);
			air.setModel_name("AirPods Pro");
			air.setBrand("Apple");
			air.setRelease_date("2019-10-30");
			air.setBattery_life(24);
			air.setNoise_cancellation("Yes");
			air.setBluetooth_version("5.0");
			air.setPrice(250);
			air.setStock_count(500);
			air.setDescription("High-quality wireless earbuds");

			eM.persist(air);
			eT.commit();
		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			eM.close();
			eMF.close();
		}
	}
}
