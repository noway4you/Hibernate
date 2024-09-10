package tw.test.hi1.app;

import tw.test.hi1.dao.CourseDao;
import tw.test.hi1.model.Course;

public class hi1_24 {

	public static void main(String[] args) {
		
		CourseDao dao = new CourseDao();
		Course course1 = new Course("Physics");
		Course course2 = new Course("History");
		dao.add(course1);
		dao.add(course2);
		
		
	}

}
