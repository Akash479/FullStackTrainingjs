package multiT;

public class garbageC {
	public void finalize() {
		System.out.println("garbage Calleedd");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		garbageC g= new garbageC();
		
		garbageC g1= new garbageC();
		g=null;
		g1=null;
		System.gc();
		
	}

}
