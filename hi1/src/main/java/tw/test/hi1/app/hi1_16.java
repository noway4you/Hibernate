package tw.test.hi1.app;

import tw.test.hi1.dao.AccountCarDao;
import tw.test.hi1.model.Account;

public class hi1_16 {

	public static void main(String[] args) {
		
		Account account = new Account();
		account.setAccount("EEE");
		
		AccountCarDao dao = new AccountCarDao();
		dao.addAccount(account);
		
	}

}
