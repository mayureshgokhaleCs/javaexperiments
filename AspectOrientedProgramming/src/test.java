import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import P1.Point;

public class test {

	public static void main(String[] args) {
		AbstractApplicationContext ac = new FileSystemXmlApplicationContext(
				"one.xml");

		Point pt = (Point) ac.getBean("point1");
		Point pt1 = (Point) ac.getBean("point2");
		
		pt1.print();
		System.out.println("this is pt.print   --");
		pt.print();
		/*
		 * pt.print(); try { pt.print(9); } catch (Exception e) { System.out
		 * .println(
		 * "irrespective of exception, weaving works, to act only when there is exception use aop after throwing"
		 * ); }
		 */
		System.out.println("---------------------------");
		/*Point pt3 = (Point) ac.getBean("point4");
		pt3.print();*/
	}

}
