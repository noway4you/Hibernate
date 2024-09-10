package tw.test.hi1.app;

import tw.test.hi1.dao.StudentDao;
import tw.test.hi1.model.Student;

public class hi1_25 {

	public static void main(String[] args) {
		
		Student s1 = new Student("BBB");
		Student s2 = new Student("CCC");
		Student s3 = new Student("DDD");
		
		StudentDao dao = new StudentDao();
		dao.add(s1);
		dao.add(s2);
		dao.add(s3);
		
	}

}
