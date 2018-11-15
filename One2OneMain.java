package mainClasses;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import pojoClasses.Laptop;
import pojoClasses.OneToOneMapping;

public class One2OneMain {

	public static void main(String[] args) {

		try
		{
			Configuration config = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(OneToOneMapping.class).addAnnotatedClass(Laptop.class);

			SessionFactory sessionfactory = config.buildSessionFactory();
			Session session = sessionfactory.openSession();


			Laptop lap = new Laptop();
			lap.setLaptopId(101);
			lap.setLaptopName("Dell");
			
			OneToOneMapping mapping = new OneToOneMapping();
			mapping.setEmployeeId(259);
			mapping.setEmployeeName("Employee1");
            mapping.setLaptop(lap);

			Transaction transaction=session.beginTransaction();


			session.save(mapping);
			session.save(lap);

			transaction.commit();

			session.close();
			sessionfactory.close();

			System.out.println("mapping and lap objects Saved");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
