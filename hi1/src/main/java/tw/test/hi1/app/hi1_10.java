package tw.test.hi1.app;

import java.util.List;

import tw.test.hi1.dao.MemberDao;
import tw.test.hi1.model.Member;

public class hi1_10 {

	public static void main(String[] args) {
		
		String hql = "from Member where name like '%123%'";
		MemberDao memberDao = new MemberDao();
		try {
			List<Member> members = memberDao.getByWhere(hql);
			for(Member member : members) {
				System.out.println(member.getAccount() + " : " + member.getName());
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
