import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class piggyBankJunitTest {
	static piggyBank ke=new piggyBank();
@BeforeClass
public static void st(){
	System.out.println("kaise ho:");
}
@Before
public void start(){
	System.out.println("welcome to testing");
}
	@Test
	public void test() {
		piggyBank k=new piggyBank();
		k.deposit(200);
		k.deposit(222);
		k.withdraw(22);
		int z=k.getBalance();
		Assert.assertEquals(400,z);
		int ret= k.getIt();
		Assert.assertEquals(-22,ret);
	}
	@Test
	public void test1() {
		piggyBank k=new piggyBank();
		
		int z=k.getBalance();
		Assert.assertEquals(0,z);
		int ret= k.getIt();
		Assert.assertEquals(0,ret);
	}
	public void test2(){
		ke.deposit(100);
		Assert.assertEquals(100, ke.getBalance());
		Assert.assertEquals(100, ke.getIt());
	}
	public void test3(){
		ke.deposit(300);
		ke.withdraw(100);
		Assert.assertEquals(400, ke.getBalance());
		Assert.assertEquals(-100, ke.getIt());
	}
	
	// to check for negative value
	public void test4(){
		ke.deposit(-1000);
		Assert.assertEquals(400, ke.getBalance());
		Assert.assertEquals(-100, ke.getIt());
	}
@AfterClass
	public static void afterClass(){
		ke=null;
	}
	
}
