package mainClasses;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import pojoClasses.StudentAnnotated;

public class InsertMore {

	public static void main(String[] args) {
		try
		{
			Configuration config=new Configuration().configure().addAnnotatedClass(StudentAnnotated.class);


			SessionFactory sessionFactory=config.buildSessionFactory();
			Session session=sessionFactory.openSession();
			
			/*StudentAnnotated student=new StudentAnnotated("Kanchu",987675432);
			StudentAnnotated student1=new StudentAnnotated("vicky",987675432);
			StudentAnnotated student2=new StudentAnnotated("vivek",987675432);*/
			Transaction transaction=session.beginTransaction();
			StudentAnnotated newstudent =new StudentAnnotated("vivek",987675432);
            session.save(newstudent);
			/*session.save(student);
			session.save(student1);
			session.save(student2);*/


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


