package Inh;

class hotelBooking {
	public int price;
	
	void calculate(int discount) {
		price =500 *(discount/100);
		System.out.println(price);
	}
	
}
class oyo extends hotelBooking{
	
	void calculate(int discount) {
		price =((200*discount)/100);
		System.out.println(price);
	}
	
}


public class Child  extends Parent {
	
	int i=25;
	void m1() {
		System.out.println("Child m1");
	}
	
	public static void main(String args[]) {
//		Child c= new Child();
//		System.out.println(c.i);
//		c.m1();
		
//		Parent p= new Child ();
//		p.m1();
		Parent p=new Parent();
		p.m1();
		
		oyo o= new oyo();
		o.calculate(10);
		
		
	}

}
