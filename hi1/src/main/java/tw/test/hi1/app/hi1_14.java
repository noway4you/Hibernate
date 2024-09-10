package tw.test.hi1.app;

import tw.test.hi1.dao.AccountCarDao;
import tw.test.hi1.model.Account;
import tw.test.hi1.model.Car;

public class hi1_14 {

	public static void main(String[] args) {
		
		Car car = new Car();
		car.setStatus("shopping");
		
		car.setStatus("close");
		
		Account account = new Account();
		account.setAccount("DDD");
		account.setCar(car);
		
		AccountCarDao dao = new AccountCarDao();
		dao.addAccount(account);
		
	}

}
