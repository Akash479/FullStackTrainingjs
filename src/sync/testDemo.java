package sync;
   // Non Synchronized
//class Table{
//	 synchronized void printTable(int x) throws InterruptedException {
//		for (int i=0;i<=4;i++) {
//			System.out.println(x*i);
//			Thread.sleep(500);
//		}
//	}
//}
//
//class Th1 extends Thread {
//	Table t;
//	
//	Th1(Table t)
//	{
//		this.t=t;
//	}
//	
//	public void run() {
//		try {
//			t.printTable(4);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	
//}
//class Th2 extends Thread {
//	Table t;
//	
//	Th2(Table t)
//	{
//		this.t=t;
//	}
//	public void run() {
//		try {
//			t.printTable(10);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	
//}
//
//public class testDemo {
//	
//	public static void main(String args[]) {
//		Table tb= new Table();
//		Th1 t1= new Th1(tb);
//		Th2 t2= new Th2(tb);
//		t1.start();
//		t2.start();
//		
//	}
//
//}



//  Synchronized Method 

//synchronized method_name() {
//	
//}


//Synchronized Block 

//synchronized (currentClassObjectRefernece) {
//
//}


//class Table{
// void printTable(int x) throws InterruptedException {
//	 
//	 System.out.println("x");
//	 System.out.println("Asahok");
//	 System.out.println("Samrat");
//	 synchronized (this) {
//		
//		 for (int i=0;i<=4;i++) {
//				System.out.println(x*i);
//				Thread.sleep(500);
//			}
//	}
//}
//}
//
//class Th1 extends Thread {
//Table t;
//
//Th1(Table t)
//{
//	this.t=t;
//}
//
//public void run() {
//	try {
//		t.printTable(4);
//	} catch (InterruptedException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//}
//
//}
//class Th2 extends Thread {
//Table t;
//
//Th2(Table t)
//{
//	this.t=t;
//}
//public void run() {
//	try {
//		t.printTable(10);
//	} catch (InterruptedException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//}
//
//}
//
//public class testDemo {
//
//public static void main(String args[]) {
//	Table tb= new Table();
//	Th1 t1= new Th1(tb);
//	Th2 t2= new Th2(tb);
//	t1.start();
//	t2.start();
//	
//}
//
//}

// Static Synchronization


class Table{
	synchronized static  void printTable(int x) throws InterruptedException {
		 
		 System.out.println("x");
		 System.out.println("Asahok");
		 System.out.println("Samrat");
		 
			 for (int i=0;i<=4;i++) {
					System.out.println(x*i);
					Thread.sleep(500);
				
		}
	}
	}

	class Th1 extends Thread {
	
		public void run() {
			try {
				Table.printTable(4);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
	class Th2 extends Thread {
	
		
		public void run() {
			try {
				Table.printTable(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}


	}

	public class testDemo {

	public static void main(String args[]) {
		Table tb= new Table();
		Th1 t1= new Th1();
		Th2 t2= new Th2();
		t1.start();
		t2.start();
		
	}

	}

