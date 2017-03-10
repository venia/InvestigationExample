package com.aquilla.jpa.service;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.aquilla.jpa.entity.Employee;

public class NamedQueries {

	public static void main(String[] args) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "InvestigationExample" );
	      EntityManager entitymanager = emfactory.createEntityManager();
	      Query query = entitymanager.createNamedQuery("find employee by id");
	      System.out.println("=====================================");
	      System.out.println(query);
	      query.setParameter("id", 1204);
	      System.out.println(query);
	      List<Employee> list = query.getResultList( );
	      
	      System.out.println(list);
	      for( Employee e:list ){
	         System.out.println("Employee ID :" + e.getEid( ));
	         System.out.println("\t Employee Name :" + e.getEname( ));
	      }
	      System.out.println("=====================================");

	}

}
