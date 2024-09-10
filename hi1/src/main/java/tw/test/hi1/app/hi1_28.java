package tw.test.hi1.app;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.hibernate.type.descriptor.converter.spi.JpaAttributeConverter;

import tw.test.hi1.dao.StudentDao;
import tw.test.hi1.model.Student;

public class hi1_28 extends JFrame{
	
	private CourseMenu menu;
	private Student student;
	private StudentDao dao;
	private JLabel name;
	private JButton add;
	
	public hi1_28() {
		super("add course");
		
		dao = new StudentDao();
		student = dao.getById(2);
		
		setLayout(new BorderLayout());
		JPanel top = new JPanel(new FlowLayout());
		
		name = new JLabel(student.getName());
		top.add(name);
		menu = new CourseMenu();
		top.add(menu);
		add = new JButton("add");
		top.add(add);
		
		add(top,BorderLayout.NORTH);
		
		setVisible(true);
		setSize(640,480);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		add.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				student.addCourse(menu.getselectedCourse());
				dao.update(student);
				student = dao.getById(2);
			}
		});
	}

	public static void main(String[] args) {
		
		new hi1_28();
		
	}

}
