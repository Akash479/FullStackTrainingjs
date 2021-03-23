package multiT;

public class withoutSync {
	
	public void m1(int n) {
		
		for (int i = 0; i < 6; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	class c1 extends Thread{
		withoutSync wt;
		c1(withoutSync wt){
			this.wt=wt;
		}
		public void run() {
			wt.m1(5);
		}
	}
	class c2 extends Thread{
		withoutSync wt;
		c2(withoutSync wt){
			this.wt=wt;
		}
		public void run() {
			wt.m1(10);
		}
	}

	
public  class mainTest{
	public  void main(String args[]) {
		withoutSync wt= new withoutSync();
		c1 c= new c1(wt);
		c2 ce= new c2(wt);
//		c1.start();
//		c2.start();
		
	}
}
}
