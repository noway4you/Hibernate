package tw.test.hi1.app;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.cfg.JdbcSettings;

import tw.test.hi1.model.Account;
import tw.test.hi1.model.Car;
import tw.test.hi1.model.Course;
import tw.test.hi1.model.Member;
import tw.test.hi1.model.MemberInfo;
import tw.test.hi1.model.Student;
import tw.test.hi1.model.bike;
import tw.test.hi1.model.user;

public class HibernateUtil {
	private static SessionFactory sessionFactory;
	private static StandardServiceRegistry registry;
	
	public static SessionFactory getSessionFactory() {
		if(sessionFactory == null) {
			Configuration conf = new Configuration();
			conf.configure("hibernate.cfg.xml");
			
			conf.addAnnotatedClass(Member.class);
			conf.addAnnotatedClass(MemberInfo.class);
			conf.addAnnotatedClass(user.class);
			conf.addAnnotatedClass(bike.class);

			conf.addAnnotatedClass(Account.class);
			conf.addAnnotatedClass(Car.class);
			
			conf.addAnnotatedClass(Student.class);
			conf.addAnnotatedClass(Course.class);
			
			registry = new StandardServiceRegistryBuilder().applySettings(conf.getProperties()).build();
			
			sessionFactory = conf.buildSessionFactory(registry);
		}
		return sessionFactory;
	}
	
	public static SessionFactory getSessionFactoryV2() {
		if(sessionFactory == null) {
			Configuration conf = new Configuration();

			Properties prop = new Properties();
			prop.put(JdbcSettings.JAKARTA_JDBC_DRIVER,"com.mysql.cj.jdbc.Driver");
			prop.put(JdbcSettings.JAKARTA_JDBC_URL,"jdbc:mysql://localhost/ispan");
			prop.put(JdbcSettings.JAKARTA_JDBC_USER,"root");
			prop.put(JdbcSettings.JAKARTA_JDBC_PASSWORD,"root");
			
			prop.put(Environment.SHOW_SQL,"true");
			prop.put(Environment.CURRENT_SESSION_CONTEXT_CLASS,"thread");
			
			conf.setProperties(prop);
			conf.addAnnotatedClass(Member.class);
			
			registry = new StandardServiceRegistryBuilder().applySettings(conf.getProperties()).build();
			
			sessionFactory = conf.buildSessionFactory(registry);
		}
		return sessionFactory;
	}
}
