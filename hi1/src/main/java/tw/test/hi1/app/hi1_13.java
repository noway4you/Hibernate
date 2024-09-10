package tw.test.hi1.app;

import tw.test.hi1.dao.AccountCarDao;
import tw.test.hi1.model.Account;
import tw.test.hi1.model.Car;

public class hi1_13 {

	public static void main(String[] args) {
		
		Account account = new Account();
		account.setAccount("CCC");
		
		Car car = new Car();
		car.setStatus("shopping");
		
		account.setCar(car);
		
		AccountCarDao dao = new AccountCarDao();
		dao.addAccount(account);
		
	}

}
