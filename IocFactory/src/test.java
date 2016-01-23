import P1.Factory;
import P1.Point;


public class test {

	public static void main(String[] args) {
		/*Point p1=new Point(100,200);
		Point p2=new Point();
		p1.setX(22);
		p1.setY(99);
		System.out.println(p1.toString());
		p2.setX(99);
		System.out.println(p2.toString());*/
		
		Point p1=(Point)Factory.getBean("point1");
		
		System.out.println(p1.toString());
        Point p3=(Point)Factory.getBean("point3");
		
		System.out.println(p3.toString());
	}

}
