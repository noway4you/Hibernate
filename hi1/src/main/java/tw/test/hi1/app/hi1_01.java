package tw.test.hi1.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class hi1_01 {

	public static void main(String[] args) {
		
		// session has close method , so it can do auto close
//		SessionFactory factory = HibernateUtil.getSessionFactory();
//		Session session = factory.openSession();
//		session.close();
		
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			
			String sql = "insert into member (account,password,name) values (:account,:password,:name)";
			
			Transaction transaction = session.beginTransaction();
			// setParameter return to the query , so it can append at query
			Query query = session.createNativeQuery(sql).setParameter("account","EEE").setParameter("password","123").setParameter("name","EEE123");
			int n = query.executeUpdate();
			transaction.commit();

			System.out.println(n);
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
