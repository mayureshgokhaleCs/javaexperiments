package P1;

public class Point  {
	int x;
	int y;

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

	Point() {

	}

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void print() {

		System.out.println("x:" + x);
		System.out.println("y:" + y);
	}
	public void print(int v){
	if(v==9){
		throw new RuntimeException();
	}else{
		System.out.println("tis is second print:"+v);}
	}
}
