package multiT;
 
public class multiRun implements Runnable {

	@Override
	public void run() {
		System.out.println("Runnable");
		
	}
	
	public static void main(String args[]) {
		multiRun mr= new multiRun();
		Thread t = new Thread(mr);
		t.start();
		
	}

}
