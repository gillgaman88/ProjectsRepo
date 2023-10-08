package RevisionTest;

import java.util.ArrayList;
import java.util.Collections;

public class ReviTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ArrayList<String> ArrList= new ArrayList<>();
	
	ArrList.add("Apple");
	ArrList.add("Samsung");
	ArrList.add("Moto");	
	ArrList.add("Realme");
	ArrList.add("One+");
	
	System.out.println("Before reversing arraylist:");
	System.out.println(ArrList);
	
	//reversing the arraylist
	Collections.reverse(ArrList);
	
	System.out.println("After reversing arraylist");
	System.out.println(ArrList);
	}

}
