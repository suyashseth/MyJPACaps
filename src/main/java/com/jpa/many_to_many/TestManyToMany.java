package com.jpa.many_to_many;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestManyToMany {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("myPersistanceUnit");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		
		Student s1 = new Student();
		s1.setSname("Shivani");
		
		Student s2 = new Student();
		s2.setSname("prakash");
		
		Student s3 = new Student();
		s3.setSname("Pinki");
		
		Set<Student>student = new HashSet<Student>();
		student.add(s1);
		student.add(s2);
		student.add(s3);
		
		Trainer t1 = new Trainer();
		t1.setTname("Suyash");
		
		Trainer t2 = new Trainer();
		t2.setTname("karthik");
		
		Trainer t3 = new Trainer();
		t3.setTname("Nagesh DJ");
		
		Set<Trainer>trainer = new HashSet<Trainer>();
		trainer.add(t1);
		trainer.add(t2);
		trainer.add(t3);
		
		t1.setStudent(student);
		t2.setStudent(student);
		t3.setStudent(student);
		
		s1.setTrainer(trainer);
		s2.setTrainer(trainer);
		s3.setTrainer(trainer);
		
		
		manager.persist(s1);
		manager.persist(s2);
		manager.persist(s3);

		manager.getTransaction().commit();
		manager.close();
		factory.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	} 
	
}
