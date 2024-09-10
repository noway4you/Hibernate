package tw.test.hi1.app;

import org.hibernate.Session;
import org.hibernate.Transaction;

import tw.test.hi1.model.Member;
import tw.test.hi1.model.MemberInfo;

public class hi1_12 {

	public static void main(String[] args) {
		
		Member member = new Member();
		member.setAccount("test1");
		member.setPassword("123");
		member.setName("test1123");
		
		MemberInfo info = new MemberInfo();
		info.setAddress("aaa");
		info.setPhone("000");
		info.setBirthday("2024-09-06");
		
		member.setMemberInfo(info);
		
		try(Session session = HibernateUtil.getSessionFactory().openSession()) {
			
			Transaction transaction = session.beginTransaction();
			
			session.persist(member);
			
			transaction.commit();
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
