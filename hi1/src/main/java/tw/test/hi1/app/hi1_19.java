package tw.test.hi1.app;

import tw.test.hi1.dao.AccountCarDao;
import tw.test.hi1.model.Account;
import tw.test.hi1.model.Car;

public class hi1_19 {

	public static void main(String[] args) {
		
		AccountCarDao dao = new AccountCarDao();
		
		try {
			Account account = dao.queryByAccountId(5);
			dao.deleteAccount(account);
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
