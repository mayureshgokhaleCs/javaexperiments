import java.io.IOException;

public class Stack implements ServiceStack , QOS{
	// service
	static int a[] = new int[10];
	static int top = 9;

	public void push(int v) {
		if (top >= 0) {
			a[top] = v;
			top--;
		} else {
			System.out.println("stack is full buddy");
		}
	}

	public void pop() {
		if (top < 9) {
			top = top + 1;
			System.out.println(a[top]);

		} else {
			System.out.println("stack is empty");
		}

	}

	public void print() {
		System.out.println("stack and stack position");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] + "--" + i);
		}
		
	}

	// creation admin work
	public static void main(String[] args) throws IOException {
		Factory.init();
		ServiceStack s = Factory.getStack(true);// you can read the config and then try which class you want
		ServiceStack ll =  Factory.getStack(false);

		Client(s);
		Client(ll);
	}

	// object consumption
	private static void Client(ServiceStack s) {
		s.push(3);
		s.print();

	}

	@Override
	public boolean getQos() {
		// TODO Auto-generated method stub
		return true;
	}

}
