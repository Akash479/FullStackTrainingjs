import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;


class Student1{
	
	public String name;
	public int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Student1(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student1 [name=" + name + ", age=" + age + "]";
	}
	
	
	 
	
	
}

public class CollectionClass {
	
	
	
	public static void main (String args[]) {
//		ArrayList<Integer> al1 = new ArrayList<>();
//		
//		al1.add(5);
//		al1.add(6);
//		al1.add(2);
//	
//		ListIterator<Integer> li1= al1.listIterator();
//		while(li1.hasNext()) {
//			int i= li1.next();
//			System.out.println(i);
//		}
//	ArrayList<Integer> al = new ArrayList<>();
//		
//		al.add(5);
//		al.add(6);
//		al.add(2);
//	
//		Iterator<Integer> li= al.iterator();
//		while(li.hasNext()) {
//			int i= li.next();
//			System.out.println(i);
//		}
		
		
//		
//		ArrayList<Student1> al = new ArrayList<>();
//		
//		Student1 s= new Student1("akash",25);
//		Student1 s1= new Student1("kamal",26);
//		Student1 s2= new Student1("rajesh",27);
//		Student1 s3= new Student1("samart",24);
//		Student1 s4= new Student1("ashokk",28);
//			al.add(s); al.add(s1);  al.add(s2);  al.add(s3);   al.add(s4);
//			Collections.sort(al, (  obj1,  obj2)->{
//				return obj1.getAge()- obj2.getAge();
//			});
//		al.forEach(obj->{
//			System.out.println(obj.getAge() +"   "+obj.getName());
//		});
		
//		Vector<Integer> v = new Vector();
//		for (int i=0;i<=5;i++) {
//			v.addElement(i);
//		}
//		System.out.println(v);
//		Enumeration<Integer> e= v.elements();
//		while(e.hasMoreElements()) {
//			int i= e.nextElement();
//			System.out.println(i);
//		}
		
		// Fail Fast
//
		Map<String,String >ma= new HashMap<>();
		ma.put("1", "2");
		ma.put("1", "2");
		ma.forEach((i,j)->{
			System.out.println(i+"   "+j);
			ma.put("5", "8");
			ma.put("6", "8");
		});
		
		// Fail Safe
//		Map<String,String >ma1= new ConcurrentHashMap<>();
//		ma1.put("1", "2");
//		ma1.put("1", "2");
//		ma1.forEach((i,j)->{
//			System.out.println(i+"   "+j);
//			ma1.put("5", "8");
//		});
	
		
		
	}
	
	

}
