package tw.test.hi1.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import tw.test.hi1.app.HibernateUtil;
import tw.test.hi1.model.Student;

public class StudentDao {

	public void add(Student student) {
		Transaction transaction = null;
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			transaction = session.beginTransaction();
			session.persist(student);
			transaction.commit();
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public void update(Student student) {
		Transaction transaction = null;
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			transaction = session.beginTransaction();
			session.merge(student);
			transaction.commit();
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public List<Student> getAll() {
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			Query<Student> result = session.createQuery("from Student",Student.class);
			return result.getResultList();
		}catch(Exception e) {
			System.out.println(e);
			return null;
		}
	}
	
	public Student getById(int id) {
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			return session.get(Student.class,id);
		}catch(Exception e) {
			System.out.println(e);
			return null;
		}
	}
	
}
