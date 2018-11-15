package mainClasses;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import pojoClasses.Address;
import pojoClasses.Phone;


public class ProductTest {

	public static void main(String[] args) {
		try
		{
			Configuration config=new Configuration().configure().addAnnotatedClass(Phone.class);
		
			
			Phone phone = new Phone("SecondUser","Apple","rg12456v");
			
			SessionFactory sessionFactory=config.buildSessionFactory();
			Session session=sessionFactory.openSession();

			
			Transaction transaction=session.beginTransaction();
			Address addr = new Address(234,"Mumbai",34256787);
			phone.setAddress(addr);
		

             

			session.save(phone);

			transaction.commit();

			session.close();
			sessionFactory.close();

			System.out.println("Object Saved");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}




