package mainClasses;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import pojoClasses.Laptop_Many2Many;
import pojoClasses.Many2Manymap;



public class Many2ManyMain {

	public static void main(String[] args) {

		try
		{
			Configuration config = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Many2Manymap.class).addAnnotatedClass(Laptop_Many2Many.class);

			SessionFactory sessionfactory = config.buildSessionFactory();
			Session session = sessionfactory.openSession();

			Many2Manymap mapping = new 	Many2Manymap();
			mapping.setEmployeeId(259);
			mapping.setEmployeeName("Employee1");
			
			Many2Manymap map = new 	Many2Manymap();
			map.setEmployeeId(261);
			map.setEmployeeName("Employee2");
			
			Laptop_Many2Many lap = new Laptop_Many2Many ();
			lap.setLaptopId(101);
			lap.setLaptopName("Dell");
			
			Laptop_Many2Many lap1 = new Laptop_Many2Many();
			lap1.setLaptopId(102);
			lap1.setLaptopName("Hp");
			
		
			
            
            mapping.getLaptop().add(lap1);
            map.getLaptop().add(lap1);
            lap.getMany2many().add(mapping);
            lap1.getMany2many().add(mapping);
            lap1.getMany2many().add(map);
			Transaction transaction=session.beginTransaction();

			
			session.save(mapping);
			session.save(map);
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
