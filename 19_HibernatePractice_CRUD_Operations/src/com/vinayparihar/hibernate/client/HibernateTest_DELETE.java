package com.vinayparihar.hibernate.client;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.vinayparihar.hibernate.beans.dto.Address;
import com.vinayparihar.hibernate.beans.dto.FourWheller;
import com.vinayparihar.hibernate.beans.dto.TwoWheller;
import com.vinayparihar.hibernate.beans.dto.UserDetails;
import com.vinayparihar.hibernate.beans.dto.Vehicle;

public class HibernateTest_DELETE {

	public static void main(String[] args) {

		Configuration configuration = new Configuration();
		SessionFactory sessionFactory = configuration.configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		//Deleting data from the database
		
		UserDetails userDetails=(UserDetails)session.get(UserDetails.class, 10);
		session.delete(userDetails);
		
		/* (OR) */
		session.delete(session.get(UserDetails.class, 9));
		
		

		session.getTransaction().commit();
		session.close();

	}

}
