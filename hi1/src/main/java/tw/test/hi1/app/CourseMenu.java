package tw.test.hi1.app;

import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

import tw.test.hi1.dao.CourseDao;
import tw.test.hi1.model.Course;

public class CourseMenu extends JComboBox<String>{
	
	private List<Course> courses;
	
	public CourseMenu() {
		
		courses = new CourseDao().getAll();
		setModel(new MyModel());
		
	}
	
	public Course getselectedCourse() {
		return courses.get(getSelectedIndex());
	}
	
	private class MyModel extends DefaultComboBoxModel<String>{

		@Override
		public int getSize() {
			return courses.size();
		}

		@Override
		public String getElementAt(int index) {
			return courses.get(index).getName();
		}
		
		
		
	}
	
}
