package covirant;


//class Parent{
//	 Parent get(){
//		return this;
//	}
//}
//
//class Child {
//	Child get() {
//		return this;
//	}
//	
//	void message() {
//		System.out.println("Child");
//	}
//}

 class Parent{
		Parent(){
			System.out.println("Parent Constructor");
		}
		String s="Parent";
		private void m() {
			System.out.println("m MEthod in parent");
		}
		
		public static void main(String args[]) {
			Parent p = new Parent();
			p.m();
		}
	 void m2() {
			
			
	}
}

	class Child extends Parent {
		Child(){
			super();
			System.out.println("Child Constructor");
		}
		final int value=50;
		public String s="Child";
		void m2() {
			
			System.out.println(s);
			System.out.println(super.s);
		}
	
	}
	public class demo {
		
		void m2() {
			
		}

			
		public static void main (String args[]) {
			Parent p= new Child();
			p.m2();
			
		}
			
		
		}
