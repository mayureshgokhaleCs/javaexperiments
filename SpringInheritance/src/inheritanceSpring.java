import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;


public class inheritanceSpring {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext ac = new FileSystemXmlApplicationContext("one.xml");
		Point pt= (Point)ac.getBean("point1");
	}

}
