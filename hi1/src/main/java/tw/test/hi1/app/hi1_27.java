package tw.test.hi1.app;

import java.util.Set;

import tw.test.hi1.dao.CourseDao;
import tw.test.hi1.model.Course;
import tw.test.hi1.model.Student;

public class hi1_27 {

	public static void main(String[] args) {
		
		CourseDao dao = new CourseDao();
		Course course = dao.getById(4);
		Set<Student> students = course.getStudents();
		System.out.println(students.size());
		
		for(Student student : students) {
			System.out.println(student.getName());
		}
		
	}

}
