package BasicJavaProgramming;

import java.util.HashSet;

public class JavaHashSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	HashSet<Integer> Numbers = new HashSet<Integer>();
	
	Numbers.add(4);
	Numbers.add(5);
	Numbers.add(6);
	Numbers.add(7);
	
	for (int i=1; i<=6; i++){
	if (Numbers.contains(1)){
		System.out.println(i + " " + "was found in the set");
	}else{
		System.out.println(i + " "+ "not was found in the set");
			
		}
	}
	}
	
	}


