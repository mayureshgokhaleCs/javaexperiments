import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import P1.Demo;


public class springEL {


	public static void main(String[] args) {
		AbstractApplicationContext ac = new FileSystemXmlApplicationContext("springel.xml");
		
		Demo j=(Demo) ac.getBean("start");
		System.out.println(j.toString());
		Demo j1=(Demo) ac.getBean("start1");
		System.out.println(j1.toString());
	}

}
