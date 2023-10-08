package BasicJavaProgramming;

import java.util.HashMap;

public class JavaHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
     HashMap <String,String> Capitalcities = new HashMap<String, String>();		 
	 Capitalcities.put("England", "London");
	 Capitalcities.put("India", "Punjab");
	 Capitalcities.put("Canada", "Ontario");
	 Capitalcities.put("Norway", "Oslo");
	 
	// Capitalcities.remove("India");
//	 Capitalcities.clear();
     
	 
	 System.out.println(Capitalcities);
	 System.out.println(Capitalcities.get("England"));
	 
	 System.out.println(Capitalcities.size());
	
	 //Loop through the HashMap
	 for (String i : Capitalcities.keySet()){
		 System.out.println(i);
	 }
	 
	 for(String h: Capitalcities.values()){
		 System.out.println(h);
	   } 
	}
} 
   