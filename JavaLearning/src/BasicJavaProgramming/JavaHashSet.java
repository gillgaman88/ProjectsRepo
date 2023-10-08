package BasicJavaProgramming;

import java.util.HashSet;

public class JavaHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	HashSet<String> Cars= new HashSet<String>();	
	Cars.add("VOLVO");
	Cars.add("MARUTI");
	Cars.add("BMW");
	Cars.add("AUDI");
	Cars.add("BENTELEY");
	
	Cars.remove("AUDI");
		
	System.out.println(Cars.size());
	System.out.println(Cars);
	System.out.println(Cars.contains("BMW"));
	
	for (String i: Cars){
		System.out.println(i);
	}
	
	}

}
