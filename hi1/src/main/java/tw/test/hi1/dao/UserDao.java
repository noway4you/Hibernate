package tw.test.hi1.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import tw.test.hi1.app.HibernateUtil;
import tw.test.hi1.model.user;

public class UserDao {
	
	public void save(user user) {
		Transaction transaction = null;
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			transaction = session.beginTransaction();
			session.persist(user);
			transaction.commit();
		}catch(Exception e) {
			System.out.println(e);
			if(transaction!=null) {
				transaction.rollback();
			}
		}
	}
	
	public void update(user user) {
		Transaction transaction = null;
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			transaction = session.beginTransaction();
			session.merge(user);
			transaction.commit();
		}catch(Exception e) {
			System.out.println(e);
			if(transaction!=null) {
				transaction.rollback();
			}
		}
	}
	
	public user queryById(int id) {
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			return session.get(user.class,id);
		}catch(Exception e) {
			return null;
		}
	}
	
}
