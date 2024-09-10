package tw.test.hi1.app;

import tw.test.hi1.dao.MemberDao;
import tw.test.hi1.model.Member;

public class hi1_08 {

	public static void main(String[] args) {
		
		MemberDao memberDao = new MemberDao();
		try {
			Member member = memberDao.getMemberById(13);
			
			memberDao.deleteMember(member);
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
