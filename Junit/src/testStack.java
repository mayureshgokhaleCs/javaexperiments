import junit.framework.Assert;

import org.junit.Test;


public class testStack {
	@Test
	public void create() {
		Stack s=new Stack();
	}
	@Test
	public void pushTest1(){
		Stack s=new Stack();
		s.push(40);
		s.print();
		Assert.assertEquals(40, s.peek());
	}
	@Test
	public void pushTest2(){
		Stack s=new Stack();
		
	s.push(40);
	s.push(40);s.push(40);s.push(40);s.push(40);
	s.print();
	s.push(90);
		
	}
}
