package multiT;

public class multi extends Thread {
	
	public void run() {
		System.out.println("Runnning");
	}

	
	public static void main(String args[]) {
		 multi m= new multi();
		m.start();
	}
	
}
