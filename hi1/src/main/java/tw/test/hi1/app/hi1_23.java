package tw.test.hi1.app;

import org.hibernate.Session;
import org.hibernate.Transaction;

import tw.test.hi1.model.Course;
import tw.test.hi1.model.Student;

public class hi1_23 {

	public static void main(String[] args) {
		
		Transaction transaction = null;
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			
			transaction = session.beginTransaction();
			
			Student s1 = new Student("AAA");
			
			Course c1 = new Course("Math");
			Course c2 = new Course("English");
			Course c3 = new Course("Physics");
			
			s1.addCourse(c1);
			s1.addCourse(c2);
			s1.addCourse(c3);
			
			session.persist(s1);
			
			transaction.commit();
		
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
