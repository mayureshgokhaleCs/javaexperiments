
public class Stack {
static int top=0;
static int a[]=new int[5];
	
	public void push(int i) {
	
		if(top>4)
		{
			System.out.println("Stack is full buddy");}
		else{
			a[top]=i;
			top=top+1;
			
		}
		}

	public int peek() {
		
		return a[top];
	}
	public String pop(){
		if(top>0){
		int poped=a[--top];
		
		return("item popped out"+poped);
		}
		else{
			return("stack is empty");
		}
	}
 public void print(){
	 for(int i:a)
		 System.out.println(i);
 }
 public static void main(String args[]){
	 Stack s=new Stack();
	 s.push(1);
	 s.push(6);
	 s.push(0);
	 s.push(84);
	 s.push(55);
	 s.push(88);
	 s.print();
	System.out.println( s.pop());
	System.out.println( s.pop());
	System.out.println( s.pop());
	System.out.println( s.pop());
	System.out.println( s.pop());
	System.out.println( s.pop());
	 
	 
 }
}
