package P1;

public class Point {
int x;
int y;
String comment;
public Point(){
	
}
Point(int x,int y,String comment){
	this.x=x;
	this.y=y;
	this.comment=comment;
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
public String getComment() {
	return comment;
}
public void setComment(String comment) {
	this.comment = comment;
}
public String toString(){
	return ("X:"+x+"Y:"+y+"Comment:"+comment);
}
}
