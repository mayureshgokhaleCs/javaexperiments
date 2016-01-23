import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import P1.Point;


public class inheritanceSpring {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext ac = new FileSystemXmlApplicationContext("one.xml");
		//Point pt= (Point)ac.getBean("point1");
		//System.out.println(pt);
		Point pt1= (Point)ac.getBean("point3");
		System.out.println(pt1);
	}

}
