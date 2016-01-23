package P1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class Factory {
static Properties pr=new Properties();
	static {
		try {
			FileReader fr = new FileReader("bean.properties");
			pr.load(fr);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public static Object getBean(String s) {
		String className=pr.getProperty(s);
		try {
			Class metaObject=Class.forName(className);
			
			Constructor cons =  metaObject.getConstructor(new Class[]{int.class,int.class});;
		    String constInput=pr.getProperty("point3.constructor");
		    String[] seperate= constInput.split(",");
		    int arg1=Integer.parseInt(seperate[0]);
		    int arg2=Integer.parseInt(seperate[1]);
		    Object myObject = (Object)cons.newInstance(arg1,arg2);
		    return myObject;
		    /*
		    Object obj =metaObject.newInstance();
			Method[] methods = metaObject.getMethods();
			Method method =
				    metaObject.getMethod("setX", int.class);
			Method method1 =
				    metaObject.getMethod("setY", int.class);
		    try {
				method.invoke(obj, Integer.parseInt(pr.getProperty("point1x")));
				method1.invoke(obj, Integer.parseInt(pr.getProperty("point1y")));
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return obj;*/
		    
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
}
