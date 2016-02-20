package P1;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class advice3 {

	@Pointcut("execution(* P1.Point.print(..))")
	public void id(){
		
	}
	@Before("id()")
	public void Method1(){
		System.out.println("this is advice 3 method 1");
	}
}
