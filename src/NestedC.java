
public class NestedC {

	
	private String s="USA";
	
	class innerS{
		void m1() {
			System.out.println("String s:::"+s);
		}
	}
	
	public static void main(String[] args) {
		NestedC nc= new NestedC();
		NestedC.innerS in= nc.new innerS();
		in.m1();
		
		// TODO Auto-generated method stub

	}

}
