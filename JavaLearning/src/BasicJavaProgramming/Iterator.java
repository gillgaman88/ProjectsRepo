package BasicJavaProgramming;

import java.util.ArrayList;

public class Iterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ArrayList<String> Cars = new ArrayList<String>();
	Cars.add("VOLVO");
    Cars.add("MARUTI"); 
    Cars.add("AUDI"); 
    Cars.add("BENTELEY"); 
	
    System.out.println(Cars);
    
    java.util.Iterator <String> IT= Cars.iterator();
	
	System.out.println(IT.next());
	}
  }
