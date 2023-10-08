package ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListExample {

//	public static void main(String[] args){
//	ArrayList<String> Cars = new ArrayList<String>();
//	Cars.add("VOLVO");
//	Cars.add("BMW");
//	Cars.add("HyundaiVerna");
//	Cars.add("Kia Seltios");	
//	
//	//Cars.get(0);
//	//need to set the items in the arrayList
//	//Cars.set(0, "Opel");
//	
//	//needs to remove the link
//	//Cars.remove(2);
//	
//	//Cars.clear();
//	
//	//Cars.size();
//	
//	for (int i=0; i<Cars.size();i++);{
//	
//	System.out.println(Cars.get(0));
//	}
//  }
//}
//   class Number {
//	public static void main1(String[] args){
//
//ArrayList<Integer> myNumber= new ArrayList<Integer>();
//myNumber.add(10);
//myNumber.add(15);
//myNumber.add(20);
//myNumber.add(25);
//for (int i: myNumber){
//System.out.println(i);
//   }
// }

   
//   public static void main(String[] args){
//	 ArrayList<String> myVehicle = new ArrayList<String>();
//	 myVehicle.add("VOLVO");
//	 myVehicle.add("OPEL");
//	 myVehicle.add("BMW");
//	 myVehicle.add("MADZA");
//	 myVehicle.set(0, "Maruti");
//	 System.out.println("Which car is mine:"+ myVehicle.get(1));
//	 
//	 System.out.println("Car is:" +myVehicle);
	 
//	public static void main(String[] args){
//	ArrayList<String> Cars = new ArrayList<String>();
//	Cars.add("VOLVO");
//	Cars.add("BMW");
//	Cars.add("OPEL");
//	for (int i=0; i<Cars.size();i++){
//		System.out.println(Cars.get(i));
//	}
//	 
	//Sort an ArrayList of Strings
	public static void main (String[] args){
	ArrayList<String> Cars= new ArrayList<String>();
	Cars.add("VOLVO");
	Cars.add("BENTLEY");
	Cars.add("BMW");
	Collections.sort(Cars);
	for (String i:Cars){
		System.out.println(i);
	}
   }
  }