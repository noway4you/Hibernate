package tw.test.hi1.app;

import java.util.List;

import tw.test.hi1.dao.MemberDao;
import tw.test.hi1.model.Member;

public class hi1_06 {

	public static void main(String[] args) {
		MemberDao memberDao = new MemberDao();
		
		try {
			List<Member> members = memberDao.getAll();
			for(Member member : members) {
				System.out.println(member.getAccount());
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
