package com.jpa.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.jpa.beans.User;

public class TestEmployee {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("myPersistanceUnit");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		
		Employee emp = new Employee();
		emp.setEid(3);
		emp.setName("jyoti");
		emp.setSalary(15000);
		
		manager.persist(emp);
		manager.getTransaction().commit();
		manager.close();
		factory.close();
	}
}
