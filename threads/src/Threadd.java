
public class Threadd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Thread t1=new Thread();
		
		Work1 w=new Work1();
		
		Work2 w1=new Work2();
		Thread t2=new Thread(w1);
		t2.start();
		t2.setName("t2");
		w.setName("t1");
		w.start();
		Thread t=Thread.currentThread();
		for(int i=0;i<5;i++){
			System.out.println("hello main"+t.getName()+i);
			try {
				t.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
class Work1 extends Thread{

	public void run(){
		Thread t=Thread.currentThread();
		for(int i=0;i<5;i++){
		System.out.println("here work1"+i+t.getName());
		try {
			t.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
	}
}
class Work2 implements Runnable{

	public void run(){
		Thread t=Thread.currentThread();
		
		for(int i=0;i<5;i++){
		System.out.println("here work2"+i+t.getName());
		try {
			t.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
	}
}