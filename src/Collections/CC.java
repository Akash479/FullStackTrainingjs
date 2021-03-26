package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class CC {
	

public static void main (String args[]) {
	
	ArrayList<Integer> al1 = new ArrayList<>();
	 al1.add(2020);
	 al1.add(2021);
	 al1.add(20222);
	 al1.add(0, 2023);
	
	ArrayList<Integer> al = new ArrayList<>();
	 al.add(1);
	 al.add(2);
	 al.add(2);
	 al.add(0, 55);
	 al.addAll(1,al1);
	 System.out.println(al.contains(5));
	 System.out.println("Index::::    "+al.get(5));
	 System.out.println( "Size of Array :::  " +al.size());
	 al.remove(5);
	 System.out.println( "Size of Array :::  " +al.size());
	 System.out.println("Array Before SOrting ::"+ al);
	 Collections.sort(al);
	al.forEach(i->System.out.println(i));
}

}
/// Array 

//It is for Fixed Size;
//It can Store Only Homogeneous Objects

/// Collection 

//It doesn't  has fixed Size;
// It  can store both Homogeneous and Hterogeneous object 




