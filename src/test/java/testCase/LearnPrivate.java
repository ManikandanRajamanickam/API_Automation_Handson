package testCase;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class LearnPrivate{
	
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, InvocationTargetException {
	//	LearnPrivate learnPrivate = new LearnPrivate();
	 
		Class c = Class.forName("DemoPrivateMethodCall");
		Object o = c.newInstance();
		Method m = c.getDeclaredMethod("myName", null);
		m.setAccessible(true);
		m.invoke(o, null);
		
	}

}
