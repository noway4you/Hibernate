package tw.test.hi1.app;

import tw.test.hi1.dao.AccountCarDao;
import tw.test.hi1.model.Account;
import tw.test.hi1.model.Car;

public class hi1_17 {

	public static void main(String[] args) {
		
		AccountCarDao dao = new AccountCarDao();
		try {
			Account account = dao.queryByAccountId(3);
			System.out.println("-------------------");
			System.out.println(account.getAccount());
			if(account.getCar()==null) {
				System.out.println("no car");
				Car car = new Car();
				car.setStatus("shopping");
				
				account.setCar(car);
				
				dao.updateAccount(account);
			}else {
				System.out.println("has car");
				account.getCar().setStatus("close");
				dao.updateAccount(account);
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
