import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;


public class test {
	AbstractApplicationContext ac = new FileSystemXmlApplicationContext("two.xml");
}
