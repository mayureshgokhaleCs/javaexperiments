package P1;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;


public class Point implements ApplicationListener <Event1> {
	private int x;
	private int y;

	public Point(int x, int y) {

		this.x = x;
		this.y = y;
	}

	public Point() {

	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String toString() {
		return ("x :" + x + "|| y :" + y);
	}

	static public Point getPoint() {
		return new Point(13, 13);
	}
	/*
	public void init(){
		System.out.println("chalure");
	}
	public void destroy(){
		System.out.println("sampla re");
	}
	public String old(){
		System.out.println("old");
		return "old";
	}

	private int a[];

	public int[] getA() {
		return a;
	}

	public void setA(int[] a) {
		this.a = a;
	}

	public Point(int[] a) {
	
		this.a = a;
	}
	public Point() {
	}
	
	public String toString() {
		return ("x :" + a[0] + "|| y :" + a[1]);
	}*/

	

	@Override
	public void onApplicationEvent(Event1 arg0) {
		// TODO Auto-generated method stub
		System.out.println("point listener is called");
	}
}
