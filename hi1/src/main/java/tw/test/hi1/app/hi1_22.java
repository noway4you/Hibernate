package tw.test.hi1.app;

import java.util.List;

import tw.test.hi1.dao.UserBikeDao;
import tw.test.hi1.dao.UserDao;
import tw.test.hi1.model.bike;
import tw.test.hi1.model.user;

public class hi1_22 {

	public static void main(String[] args) {
		
		try {
			List<UserBikeDao> user_bikes = UserBikeDao.queryJoinById(2);
			UserDao userDao = new UserDao();
			user user = new UserDao().queryById(user_bikes.getFirst().getId());
			
			for(bike bike : user.getBikes()) {
				System.out.println("bikes : " + bike.getBid() + " : " + bike.getSpeed());
				bike.setSpeed(100);
			}
			
			userDao.update(user);
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
