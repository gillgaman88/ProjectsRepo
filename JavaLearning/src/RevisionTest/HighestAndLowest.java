package RevisionTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HighestAndLowest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
	List<Integer> ListNum= new ArrayList<>();
	ListNum.add(34);
	ListNum.add(94);
	ListNum.add(14);
	ListNum.add(24);	
	ListNum.add(15);	
	ListNum.add(64);
	ListNum.add(45);
	ListNum.add(04);
	
	System.out.println("");
	System.out.println("Sorted Number");
	Collections.sort(ListNum);
	System.out.println(ListNum.get(0));
	System.out.println(ListNum.get(ListNum.size()-1));
	
	for (int i=0;i<ListNum.size();i++){
		System.out.println(ListNum.get(i));
	}
	
	for (int i=0;i<ListNum.size();i++){
		int temp=0;
	for (int j=(i+1);j<ListNum.size();j++){
		if (ListNum.get(i)> ListNum.get(j)){
			temp=ListNum.get(i);
			ListNum.set(i, ListNum.get(j));
			ListNum.set(j, temp);
		}
	}	
	//System.out.println("");
	}
	System.out.println("Max Integer=" +ListNum.get(0));
	System.out.println("Min Integer=" +ListNum.get(ListNum.size()-1)); 
	}

}
