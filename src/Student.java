
public class Student implements Cloneable {
	
	static int id1=30;
	int id;
	String name;
	String Location;
	public Student(int id, String name, String location) {
		super();
		this.id = id;
		this.name = name;
		Location = location;
	}
	
	public static void main(String args[]) {
		
		Student s= new Student(1,"22","33");
//		try {
//			Student s2=(Student) s.clone();
//			
//			System.out.println(s2.id);
//		} catch (CloneNotSupportedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		System.out.println(Math.max(10,29));
		System.out.println(Math.min(10,29));
		System.out.println(Math.random() *10000);
		// Auto Boxing :Converting  Primitive  to Object
		Integer i=Integer.valueOf(id1);
		// un Boxing : Converting Object to Primitive
		int pe=i.intValue();
		System.out.println(pe);
		
	}
	
}
