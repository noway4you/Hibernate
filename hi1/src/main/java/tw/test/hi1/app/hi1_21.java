package tw.test.hi1.app;

import java.util.LinkedList;
import java.util.List;

import tw.test.hi1.dao.UserBikeDao;
import tw.test.hi1.dao.UserDao;
import tw.test.hi1.model.user;

public class hi1_21 {

	public static void main(String[] args) {
		
		try {
			List<UserBikeDao> user_bikes = UserBikeDao.queryJoin();
			
			List<user> users = new LinkedList<user>();
			String nowName = "";
			
			for(UserBikeDao user_bike : user_bikes) {
				System.out.println(user_bike.getName() + " : " + user_bike.getColor() + " : " + user_bike.getSpeed());
				
				if(!nowName.equals(user_bike.getName())) {
					user user = new UserDao().queryById(user_bike.getId());
					users.add(user);
					nowName = user_bike.getName();
				}
				
			}
			
			System.out.println("--------------");
			System.out.println(users.size());
			
			for(user user : users) {
				System.out.println(user.getName() + " : " + user.getBikes().size());
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
