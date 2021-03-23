package multiT;

public class SleepDemo extends Thread {
	
	public void run() {
		for (int i=0;i<3;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
	
	public static void main(String args[]) {
		SleepDemo s= new SleepDemo();
		SleepDemo s2= new SleepDemo();
		SleepDemo s3= new SleepDemo();
//		s.start();
//		s.start();
		s.start();
		s.setName("samrat");
		s.setPriority(10);
		try {
			s.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		s2.start();
		s3.start();
		s3.setDaemon(true);
		System.out.println(s.getName());
		System.out.println(s.getPriority());
	}

}
