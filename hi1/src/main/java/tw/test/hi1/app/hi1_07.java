package tw.test.hi1.app;

import java.io.File;
import java.io.FileInputStream;
import tw.test.hi1.dao.MemberDao;
import tw.test.hi1.model.BCrypt;
import tw.test.hi1.model.Member;

public class hi1_07 {

	public static void main(String[] args) {
		Member member = new Member();
		member.setAccount("FFF");
		member.setPassword(BCrypt.hashpw("123",BCrypt.gensalt()));
		member.setName("FFF123");
		
		File file = new File("dir1/ball3.png");
		try {
			FileInputStream fin = new FileInputStream(file);
			byte[] icon = fin.readAllBytes();
			member.setIcon(icon);
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
		MemberDao memberDao = new MemberDao();
		memberDao.addMember(member);
	}

}
