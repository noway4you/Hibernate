package tw.test.hi1.app;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class hi1_04 {

	public static void main(String[] args) {
		
		try(Session session = HibernateUtil.getSessionFactoryV2().openSession()){
			
			String sql = "select * from member";
			
			Transaction transaction = session.beginTransaction();
			
			Query query = session.createNativeQuery(sql);
			List<Object[]> results = query.getResultList();
			for(Object[] result : results) {
				System.out.println("id:" + result[0] + "\taccount:" + result[1] + "\tpassword:" + result[2] + "\tname:" + result[3]);
			}
			
			transaction.commit();
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
