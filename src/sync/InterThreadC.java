package sync;


class Customer{
	int amount=6000;
	
	synchronized void withdraw(int amount) {
		System.out.println("Withdral");
		if(this.amount < amount) {
			System.out.println("Less Balance  , Deposit Frst");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.amount -= amount;
		System.out.println(this.amount);
		System.out.println(" withdral Completed");
	}
	
synchronized void deposit(int amount) {
	System.out.println("Deposit");
	this.amount+=amount;
	System.out.println(this.amount);
	System.out.println("Deposit Completed");
	notify();
}
	
}


public class InterThreadC {

	
	public static void main (String args[]) {
		Customer c= new Customer();
		new Thread() {
			public void run() {c.withdraw(10);}
		}.start();
		new Thread() {
			public void run() {c.deposit(2000000);}
		}.start();
	}
}
