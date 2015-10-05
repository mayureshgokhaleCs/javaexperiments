public class Shallowcloning {

	public static void main(String args[]) throws CloneNotSupportedException {
    Point pt1=new Point(10,20);
    Point pt2=pt1.clone();
	pt1.setX(111);
	System.out.println("print out--"+pt1);
	System.out.println("print out--"+pt2);
	Segment seg1=new Segment(pt1,pt2,1000);
	Segment cloneseg1= seg1.clone();
	cloneseg1.setA(9000);
	System.out.println("before two copies");
	System.out.println(seg1);
	System.out.println(cloneseg1);
	// thus we see that share same links to P
	System.out.println("after two copies");
	seg1.setPt1(300,500);
	cloneseg1.setPt2(1000, 99);
	// the aim is to show that in shallow cloning the links will be shared but there will
	// two segment copies sharing same points
	// use of new operator modifying the Points in Setpt1 will defeat the purpose so
	// we share the same object
	System.out.println(seg1);
	System.out.println(cloneseg1);
		
	}

}

class Point implements Cloneable {
	int x;
	int y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
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
		return ("x--" + x + ",y--" + y);
	}

	protected Point clone() throws CloneNotSupportedException {
		return (Point)super.clone();

	}
}
class Segment implements Cloneable{
	Point pt1;
	Point pt2;
	int a;
	
	Segment(Point pt1,Point pt2,int a){
		this.pt1=pt1;
		this.pt2=pt2;	
		this.a=a;
	}

	public Point getPt1() {
		return pt1;
	}

	public void setPt1(int x,int y) {
		this.pt1.setX(x);
		this.pt1.setY(y);
	}
	public void setA(int a){
		this.a=a;
	}

	public Point getPt2() {
		return pt2;
	}

	public void setPt2(int x,int y) {
		this.pt2.setX(x);
		this.pt2.setY(y);
	}
	public String toString(){
		return "Point pt1:"+pt1+"Point pt2:"+pt2+"A--"+a;
		
	}
	protected Segment clone() throws CloneNotSupportedException {
		return (Segment)super.clone();

	}
	
}