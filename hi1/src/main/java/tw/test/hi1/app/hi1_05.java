package tw.test.hi1.app;

import java.lang.reflect.Method;

public class hi1_05 {

	public static void main(String[] args) {
		Class<String> stringClass = String.class;
		Method[] methods = stringClass.getMethods();
		for(Method method : methods) {
			System.out.println(method.getName() + " : " + method.getParameterCount());
		}
		System.out.println("---------");
		try {
			String s1 = stringClass.newInstance();
			System.out.println("ok");
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
