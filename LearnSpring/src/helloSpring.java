import org.springframework.context.ApplicationContext;
import org.apache.logging.log4j.Logger; 
import org.apache.logging.log4j.LogManager;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import P1.Point;
import P1.Segment;

public class helloSpring {

	public static void main(String[] args) {
	
		System.out.println("hello spring");
		AbstractApplicationContext ac = new FileSystemXmlApplicationContext("two.xml");
		final Logger log4j = LogManager.getLogger(helloSpring.class 
		        .getName());
		
		//Point pt= (Point)ac.getBean("point1");
		//Point pt1= (Point)ac.getBean("point3");
		//System.out.println(pt);
		//pt.setX(444);
		//System.out.println(pt1);
		//System.out.println(pt);
	/*	Segment s1=(Segment)ac.getBean("segment1");
		Segment s2=(Segment)ac.getBean("segment2");
		Segment s3=(Segment)ac.getBean("segment3");
		Segment s4=(Segment)ac.getBean("segment4");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);*/
		Point s1=(Point)ac.getBean("point1");
		
		log4j.debug(s1);
		System.out.println(s1);
	//	Point pt=(Point)ac.getBean("p4");
	//	System.out.println(pt);
		//ac.close();
		// method injection failed seems need some jars
		
	/*	Point pt1=(Point)ac.getBean("p4");
		System.out.println(pt1);
		System.out.println(pt1.old());
		System.out.println("hw");*/
	}

}
