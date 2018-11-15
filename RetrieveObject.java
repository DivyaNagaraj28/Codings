package mainClasses;

import java.util.List;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import pojoClasses.StudentAnnotated;

public class RetrieveObject {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		try
		{
			Configuration config=new Configuration().configure().addAnnotatedClass(StudentAnnotated.class);


			SessionFactory sessionFactory=config.buildSessionFactory();
			Session session=sessionFactory.openSession();
			
			Transaction transaction=session.beginTransaction();
            Query<StudentAnnotated> query= session.createQuery("from StudentAnnotated");
            List<StudentAnnotated> liststu=query.list();
			
			for(StudentAnnotated student:liststu)
			{
				
				System.out.println(student);
			}
			
			
			

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


