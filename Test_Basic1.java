package mainClasses;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import pojoClasses.StudentAnnotated;

public class Test_Basic1 {

	public static void main(String[] args) {
		try
		{
			Configuration config=new Configuration().configure().addAnnotatedClass(StudentAnnotated.class);
			

			SessionFactory sessionFactory=config.buildSessionFactory();
			Session session=sessionFactory.openSession();

			StudentAnnotated student=new StudentAnnotated("dharshu",987675432);

			Transaction transaction=session.beginTransaction();
             

			session.save(student);

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




