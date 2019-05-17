package com.jpa.beans;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestUser {

	public static void main(String[] args) {
		
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("myPersistanceUnit");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		
		User us = new User();
		us.setUserid(101);
		us.setUsername("HArshit");
		us.setUserpass("qwerty");
		
		manager.persist(us);
		manager.getTransaction().commit();
		manager.close();
		factory.close();
		
		
		
		
		
		
		
		
	}
}
