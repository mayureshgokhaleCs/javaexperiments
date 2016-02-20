


public class Point {
String x;
String y;
String comment;
public Point(){
	
}
Point(String x,String y,String comment){
	this.x=x;
	this.y=y;
	this.comment=comment;
}
public String getX() {
	return x;
}
public void setX(String x) {
	this.x = x;
}
public String getY() {
	return y;
}
public void setY(String y) {
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
