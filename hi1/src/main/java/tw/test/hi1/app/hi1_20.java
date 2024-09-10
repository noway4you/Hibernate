package tw.test.hi1.app;

import tw.test.hi1.dao.UserDao;
import tw.test.hi1.model.bike;
import tw.test.hi1.model.user;

public class hi1_20 {

	public static void main(String[] args) {
		
		user user = new user();
		user.setName("CCC");
		
		bike b1 = new bike();
		b1.setColor("color1");
		b1.setSpeed(1.1);
		b1.setUser(user);
		
		bike b2 = new bike();
		b2.setColor("color2");
		b2.setSpeed(1.2);
		b2.setUser(user);
		
		bike b3 = new bike();
		b3.setColor("color3");
		b3.setSpeed(1.3);
		b3.setUser(user);
		
		user.addBike(b1);
		user.addBike(b2);
		user.addBike(b3);
		
		UserDao userDao = new UserDao();
		userDao.save(user);
		
	}

}
