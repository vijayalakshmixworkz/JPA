package com.xworkz.mouse.Runner;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.mouse.dto.Singer;
public class SingerQuery5 {
    public static void main(String[] args) {
        EntityManagerFactory eMF = Persistence.createEntityManagerFactory("xworkz");
        EntityManager eM = eMF.createEntityManager();
        EntityTransaction eT = eM.getTransaction();

       
        Query query=eM.createNamedQuery("findByAge");
        Object object=query.getSingleResult();
        Singer sin=(Singer)object;
        System.out.println("values:"+sin.getName()+sin.getId()+sin.getAge()+sin.getEmail());
        try {
            eT.begin();
            eT.commit();
            System.out.println("Singer data processed successfully!");

        } catch (Exception e) {
            if (eT.isActive()) {
                eT.rollback();
                System.out.println("Transaction rolled back due to an error!");
            }
            e.printStackTrace();
        } finally {
            eM.close();
            eMF.close();
        }
        }
    }
