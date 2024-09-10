package tw.test.hi1.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import tw.test.hi1.app.HibernateUtil;
import tw.test.hi1.model.Account;
import tw.test.hi1.model.Car;

public class AccountCarDao {
	
	public void addAccount(Account account) {
		
		Transaction transaction = null;
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			
			transaction = session.beginTransaction();
			session.persist(account);
			transaction.commit();
			
		}catch(Exception e) {
			System.out.println(e);
			if(transaction != null) {
				transaction.rollback();
			}
		}
	}
	
	public void updateAccount(Account account) {
		
		Transaction transaction = null;
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			
			transaction = session.beginTransaction();
			session.merge(account);
			transaction.commit();
			
		}catch(Exception e) {
			System.out.println(e);
			if(transaction != null) {
				transaction.rollback();
			}
		}
	}
	
	public void deleteAccount(Account account) {
		
		Transaction transaction = null;
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			
			transaction = session.beginTransaction();
			if(account.getCar()!=null) {
				session.remove(account.getCar());
			}
			session.remove(account);
			transaction.commit();
			
		}catch(Exception e) {
			System.out.println(e);
			if(transaction != null) {
				transaction.rollback();
			}
		}
	}
	
	public void deleteCar(Car car) {
		
		Transaction transaction = null;
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			
			transaction = session.beginTransaction();
			session.remove(car);
			transaction.commit();
			
		}catch(Exception e) {
			System.out.println(e);
			if(transaction != null) {
				transaction.rollback();
			}
		}
	}
	
	public Account queryByAccountId(int id) throws Exception {
		
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			
			Account account = session.get(Account.class,id);
			return account;
			
		}catch(Exception e) {
			System.out.println(e);
			throw new Exception();
		}
		
	}
	
	public Car queryCarByCarId(int cid) throws Exception {
		
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			
			Car car = session.get(Car.class,cid);
			return car;
			
		}catch(Exception e) {
			System.out.println(e);
			throw new Exception();
		}
		
	}
	
}
