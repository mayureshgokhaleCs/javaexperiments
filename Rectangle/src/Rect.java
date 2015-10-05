public class Rect {
	private Segment a;
	private Segment b;
	private Segment c;
	private Segment d;

	Rect(Segment a, Segment b, Segment c, Segment d) {
      this.a=a;
      this.b=b;
      this.c=c;
      this.d=d;
	}
	
 public String toString(){
	 return ("Rectangle Segments: Segment1--"+a.toString()+"\n"+
 "Segment2--"+b.toString()+"\n"+ "Segment3--"+c.toString()+"\n"+ "Segment4--"+d.toString()+"\n");
 }
	public static void main(String[] args) {
        Point f=new Point(1,2);
        Point g=new Point(30,40);
        Point h=new Point(111,34);
        Point i=new Point(155,45);
		Segment w=new Segment(f,g);
		Segment x=new Segment(g,h);
		Segment y=new Segment(h,i);
		Segment z=new Segment(i,f);
		Rect a=new Rect(w,x,y,z);
	System.out.println(a.toString());
	}

}

class Segment {
	private Point pt1;
	private Point pt2;


	Segment(Point pt1,Point pt2) {
		this.pt1 = pt1;
		this.pt2 = pt2;
	}


	public Point getPt1() {
		return pt1;
	}


	public void setPt1(Point pt1) {
		this.pt1 = pt1;
	}


	public Point getPt2() {
		return pt2;
	}


	public void setPt2(Point pt2) {
		this.pt2 = pt2;
	}
	public String toString(){
		return ("Segment:"+pt1.getX()+""+pt1.getY()+"-"+pt2.getX()+""+pt2.getY());
	}
}

class Point {
	private int x;
	private int y;

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
	
}