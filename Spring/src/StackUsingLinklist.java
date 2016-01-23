
public class StackUsingLinklist implements ServiceStack, QOS {
static Node head;
public void	push(int v){
	if (head!=null){
		Node temp=new Node(head.getNumber(),head.getNext());
		head=new Node(v,temp);
	}
	else{
		
		head=new Node(v,null);
	}
	}
	public void pop(){
		if(head!=null){
		System.out.println("Popped--"+head.number);
		Node temp=head.next;
		head=temp;
		}else{
			System.out.println("empty stack");
		}
	}
	public void print(){
		Node temp=head;
		System.out.println("hey baby");
		while(temp!=null){
			
			System.out.println(temp.getNumber());
			temp=temp.next;
		}
		
	}
class Node{
	int number;
	Node next;
	Node(int n, Node ne){
		number=n;
		next=ne;	
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
}
@Override
public boolean getQos() {
	// TODO Auto-generated method stub
	return false;
}
	
}
