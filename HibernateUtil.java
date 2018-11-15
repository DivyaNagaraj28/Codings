package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	public static void main(String args[])
	{

		try
		{
			Configuration config=new Configuration();
			config.configure("hibernate.cfg.xml");

			SessionFactory sessionFactory=config.buildSessionFactory();
			Session session=sessionFactory.openSession();

			Product product=new Product(1005,"tv","sony",25000);
/*
			product.setProductId(1003);
			product.setProductName("phone");
			product.setProductDescription("apple");
			product.setProductPrice(17000);*/



			Transaction transaction=session.beginTransaction();


			session.save(product);

			transaction.commit();

			session.close();
			sessionFactory.close();

			System.out.println("Prodcut Object Saved");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}


