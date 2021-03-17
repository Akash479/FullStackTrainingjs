package abs;

 abstract  class parent{
	 abstract void  m3();
	 void m3(String s) {
		System.out.println("Hello"+s); 
	 }
	
}


public class demo extends parent {

	@Override
	void m3() {
		System.out.println("Child");
	}
	public static void main(String args[]) {
		parent p= new demo();
		p.m3();
		p.m3("Samrat");
	}

}
