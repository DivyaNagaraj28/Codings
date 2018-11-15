package mainClasses;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import pojoClasses.Laptop_1_Many;
import pojoClasses.OneToManymap;


public class One2ManyMain {

	public static void main(String[] args) {

		try
		{
			Configuration config = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(OneToManymap.class).addAnnotatedClass(Laptop_1_Many.class);

			SessionFactory sessionfactory = config.buildSessionFactory();
			Session session = sessionfactory.openSession();

			OneToManymap mapping = new OneToManymap();
			mapping.setEmployeeId(259);
			mapping.setEmployeeName("Employee1");
			
			Laptop_1_Many lap = new Laptop_1_Many();
			lap.setLaptopId(101);
			lap.setLaptopName("Dell");
			
            Laptop_1_Many lap1 = new Laptop_1_Many();
			lap1.setLaptopId(102);
			lap1.setLaptopName("Hp");
			
		
			
            mapping.getLaptop().add(lap);
            mapping.getLaptop().add(lap1);
            lap.setOne2many(mapping);
            lap1.setOne2many(mapping);

			Transaction transaction=session.beginTransaction();

			
			session.save(mapping);
			session.save(lap);
			session.save(lap1);
		

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
