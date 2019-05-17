package com.jpa.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jpa.beans.User;

public class TestEmp {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("myPersistanceUnit");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		
		//Single Result
//		Query query = manager.createQuery("select upper(e.name) from Employee e");
//	     String name = (String) query.getSingleResult();
//	    
	 
	  
	  
	  //Multiple Result
		/*
		 * List<String>names1 = query.getResultList();
		 * 
		 * for(String names:names1) { System.out.println(names); }
		 */
		
		
		
		
		
		
		
		
		manager.close();
		factory.close();
		
		
		
		
	}
}
