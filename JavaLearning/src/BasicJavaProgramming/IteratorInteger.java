package BasicJavaProgramming;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ArrayList <Integer> Numbers = new ArrayList<Integer>();
	Numbers.add(23);
	Numbers.add(24);
	Numbers.add(25);
	Numbers.add(26);
	Numbers.add(27);
	Numbers.add(28);
	
	Iterator<Integer> it = Numbers.iterator();
	while(it.hasNext()){
		Integer i=it.next();
		if (i < 10){
		it.remove();
			
		}
	}	
	
	
	
	System.out.println(Numbers);
	}
}
