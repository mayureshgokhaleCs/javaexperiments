package P1;


public class Point {
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

}
