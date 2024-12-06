package com.xworkz.resort.resortRunner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.resort.resortEntity.REntity;

import java.util.List;

public class ResortQueryRunner {
	public static void main(String[] args) {
		EntityManagerFactory eMF = Persistence.createEntityManagerFactory("xworkz");
		EntityManager eM = eMF.createEntityManager();
		EntityTransaction eT = eM.getTransaction();
		
		Query query = eM.createNamedQuery("findAll");
		List<REntity> list = query.getResultList();
		list.forEach(res -> System.out.println(res));
		System.out.println("-----------------------------------------");
		
		Query q1=eM.createNamedQuery("findById");
		q1.setParameter("byId", 1);
		Object ob1=q1.getSingleResult();
		String str1=(String)ob1;
		System.out.println("resort_name:"+str1);
		System.out.println("-----------------------------------------");

		Query q2=eM.createNamedQuery("findByName");
		q2.setParameter("byName", "Mango Forest Resort");
		Object ob2=q2.getSingleResult();
		float str2=(float)ob2;
		System.out.println("rating:"+str2);
		System.out.println("-----------------------------------------");

		Query q3=eM.createNamedQuery("findByRating");
		q3.setParameter("byRating", 4.2f);
		Object ob3=q3.getSingleResult();
		double str3=(double)ob3;
		System.out.println("cost_per_night:"+str3);
		System.out.println("-----------------------------------------");

		Query q4=eM.createNamedQuery("findRevenue");
		q4.setParameter("Location", "Nandi Hills, Bangalore");
		Object ob4=q4.getSingleResult();
		long str4=(long)ob4;
		System.out.println("total_revenue:"+str4);
		System.out.println("-----------------------------------------");

		Query q5=eM.createNamedQuery("findByLocation");
		q5.setParameter("byLocation", "Yelahanka, Bangalore");
		Object ob5=q5.getSingleResult();
		int id5=(int)ob5;
		System.out.println("id:"+id5);
		System.out.println("-----------------------------------------");
		
		try {
			eT.begin();
			eT.commit();
		} catch (Exception e) {
			if (eT.isActive()) {
				eT.rollback();
			}
			e.printStackTrace();
		} finally {
			eM.close();
			eMF.close();
		}
	}
}
