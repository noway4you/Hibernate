package tw.test.hi1.app;

import tw.test.hi1.dao.AccountCarDao;
import tw.test.hi1.model.Account;
import tw.test.hi1.model.Car;

public class hi1_18 {

	public static void main(String[] args) {
		
		AccountCarDao dao = new AccountCarDao();
		try {
			Account account = dao.queryByAccountId(3);
//			account.setCar(null);
//			
//			dao.updateAccount(account);
			
			Car car = dao.queryCarByCarId(3);
			account.setCar(car);
			dao.updateAccount(account);
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
