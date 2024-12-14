package com.xworkz.xworkzLogin.repository;

import com.xworkz.xworkzLogin.entity.LoginEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

@Repository
public class LoginRepoImpl implements LoginRepo{
    @Autowired
    EntityManagerFactory eMF;
    @Override
    public boolean save(LoginEntity loginEntity) {
        System.out.println("LoginRepoImpl created");

        EntityManager em = eMF.createEntityManager();
        EntityTransaction et = em.getTransaction();
        try {
            et.begin();
            em.persist(loginEntity);
            et.commit();
        } catch (Exception e) {
            if (et.isActive()) {
                et.rollback();
            }
        } finally {
            em.close();
            eMF.close();
        }

        return true;
    }
}
