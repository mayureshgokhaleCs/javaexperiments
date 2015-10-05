import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class Local {

public static void main(String args[]) throws Exception{
	C2 d=new C2(33,44);
	C1 f=new C1(100, 100,d);
	FileOutputStream fos=new FileOutputStream("D:\\output.txt");
	ObjectOutputStream oos=new ObjectOutputStream(fos);
	oos.writeObject(f);
	System.out.println("success in serializing");
	FileInputStream fis=new FileInputStream("D:\\output.txt");
	ObjectInputStream ois=new ObjectInputStream(fis);
	C1 u=(C1) ois.readObject();
	System.out.println("done bhai");
	System.out.println(u);
	
}
}
class C1 implements Serializable{
	int a ;
	int b;
	C2 obj2;
	
	C1(int a,int b,C2 k){
		this.a=a;
		this.b=b;
		this.obj2=k;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	@Override
    public String toString() {
        return "C1{" + "a=" + a + ", b=" + b + '}'+"obj2:"+obj2;
    }
}
class C2 implements Serializable{
	int a ;
	int b;
	
	
	C2(int a,int b){
		this.a=a;
		this.b=b;
		
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	@Override
    public String toString() {
        return "C2{" + "a=" + a + ", b=" + b + '}';
    }
}
