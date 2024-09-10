package tw.test.hi1.app;

import tw.test.hi1.dao.AccountCarDao;
import tw.test.hi1.model.Account;
import tw.test.hi1.model.Car;

public class hi1_15 {

	public static void main(String[] args) {
		
		AccountCarDao dao = new AccountCarDao();
		try {
			Account account = dao.queryByAccountId(3);
			System.out.println("----------------");
			System.out.println(account.getAccount());
			System.out.println("----------------");
			
			Car car = account.getCar();
			if(car!=null) {
				System.out.println(car.getStatus());
			}else {
				System.out.println("car is null!");
			}
		}catch(Exception e) {
			System.out.println("account is null!");
		}
		
	}

}
