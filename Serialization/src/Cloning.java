public class Cloning {

	/**
	 * @param args
	 * @throws CloneNotSupportedException 
	 */
	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		A ref = new A(10, 20);
        A ref1=(A) ref.clone();
        ref.setA(200);
        System.out.println(ref);
        System.out.println(ref1);
        
	}

}

class A implements Cloneable {
	int a;
	int b;

	A(int a, int b) {
		this.a = a;
		this.b = b;
	}
 public void setA(int a){
	 this.a=a;
 }
	public String toString() {
		return ("a=" + a + ",b=" + b);
	}
	@Override
   protected Object clone()throws CloneNotSupportedException{

	return super.clone();

	   
   }
}