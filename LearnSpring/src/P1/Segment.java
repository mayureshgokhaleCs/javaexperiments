package P1;

import org.springframework.context.ApplicationListener;

public class Segment implements ApplicationListener <Event2> {
	private Point p1;
	private Point p2;
	
	
	public Point getP1() {
		return p1;
	}
	public void setP1(Point p1) {
		this.p1 = p1;
	}
	public Point getP2() {
		return  p2;
	}
	public void setP2(Point p2) {
		this.p2 = p2;
	}
  public String toString(){
	  return ("P1:"+p1+"P2:"+p2);
  }
@Override
public void onApplicationEvent(Event2 arg0) {
	// TODO Auto-generated method stub
	System.out.println("called segment");
}
}
