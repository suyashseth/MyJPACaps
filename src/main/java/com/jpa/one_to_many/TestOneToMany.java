package com.jpa.one_to_many;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestOneToMany {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("myPersistanceUnit");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		
		Account a1 = new Account();
		a1.setBank_name("ICICI");
		
		Account a2 = new Account();
		a2.setBank_name("SBI");
		
		Account a3 = new Account();
		a3.setBank_name("Axis");
		
		List<Account> list = new ArrayList<Account>();
		list.add(a1);
		list.add(a2);
		list.add(a3);
		
		Person p1 = new Person();
		p1.setName("Rahul");
        p1.setAcc(list);
        
        manager.persist(p1);
        manager.getTransaction().commit();
        manager.close();
        factory.close();
        
		
		
		
		
		
		
		
	}
}
