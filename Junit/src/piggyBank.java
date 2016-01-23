
public class piggyBank {
	private int balance;
	private int it;

	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getIt() {
		return it;
	}
	public void setIt(int it) {
		this.it = it;
	}
	public piggyBank(){
		
	}
	public void deposit(int balance){
		if(balance > 0){
		this.balance+=balance;
		this.it=balance;
		}
	}
 public void withdraw(int v){
	 if (this.balance>v){
		 balance=balance-v;
		it=-v;
	 }
 }
 public String statement(){
	 return("Balance:"+String.valueOf(balance)+"LastTransaction:"+String.valueOf(it));
 }
}
