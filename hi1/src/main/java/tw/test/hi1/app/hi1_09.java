package tw.test.hi1.app;

import tw.test.hi1.dao.MemberDao;
import tw.test.hi1.model.Member;

public class hi1_09 {

	public static void main(String[] args) {
		
		MemberDao memberDao = new MemberDao();
		try {
			
			Member member = memberDao.getMemberById(9);
			member.setAccount("updateAAA");
			member.setName("updateAAA123");
			
			memberDao.updateMember(member);
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
