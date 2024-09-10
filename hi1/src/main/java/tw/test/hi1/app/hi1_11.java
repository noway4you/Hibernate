package tw.test.hi1.app;

import java.io.FileOutputStream;

import tw.test.hi1.dao.MemberDao;
import tw.test.hi1.model.Member;

public class hi1_11 {

	public static void main(String[] args) {
		
		MemberDao memberDao = new MemberDao();
		try {
			
			Member member = memberDao.getMemberById(15);
			member.getName();
			
			byte[] icon = member.getIcon();
			new Thread() {
				public void run() {
					try {
						FileOutputStream fout = new FileOutputStream("dir2/download1.png");
						fout.write(icon);
						fout.flush();
						fout.close();
					}catch(Exception e) {
						System.out.println(e);
					}
				}
			}.start();
			
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
