package tw.test.hi1.app;

import tw.test.hi1.dao.CourseDao;
import tw.test.hi1.dao.StudentDao;
import tw.test.hi1.model.Course;
import tw.test.hi1.model.Student;

public class hi1_26 {

	public static void main(String[] args) {
		
		StudentDao s_dao = new StudentDao();
		CourseDao c_dao = new CourseDao();
		Student student = s_dao.getById(3);
		if(student!=null) {
			System.out.println(student.getName() + " : " + student.getCourses().size());
			
			Course c4 = c_dao.getById(4);
			Course c5 = c_dao.getById(5);
			Course c6 = c_dao.getById(6);
			
			student.addCourse(c4);
			student.addCourse(c5);
			student.addCourse(c6);
			
			s_dao.update(student);
			
		}else {
			System.out.println("student not found");
		}
		
	}

}
