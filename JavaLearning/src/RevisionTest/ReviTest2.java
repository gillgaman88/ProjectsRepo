package RevisionTest;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class ReviTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	LinkedList<Integer> list=new LinkedList<Integer>();
	
	list.add(44);
	list.add(11);
	list.add(10);
	list.add(23);
	list.add(18);
	list.add(89);	
	
	Collections.sort(list);
	System.out.println(list.get(0));
    System.out.println(list.size()-1);
    
    //using the max and min methods
    System.out.println(Collections.max(list));
    System.out.println(Collections.min(list));
	}

}
