import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import P1.Event1;
import P1.Event2;

public class ImplicitInvoke {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext ac = new FileSystemXmlApplicationContext(
				"two.xml");
		Event1 e = new Event1();
		Event2 e2=new Event2();
        ac.publishEvent(e);
        ac.publishEvent(e2);
	}

}
