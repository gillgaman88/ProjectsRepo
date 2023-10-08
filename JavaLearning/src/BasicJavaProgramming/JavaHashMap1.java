package BasicJavaProgramming;

import java.util.HashMap;

public class JavaHashMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    HashMap <String, Integer> People = new HashMap<String, Integer>();
	People.put("Gamanjit", 35);
	People.put("Harpreet Kaur", 33);
	People.put("Jashan", 33);
	
	for (String i : People.keySet()){
	System.out.println("key: " + i + " Value: " + People.get(i));	
	}
		
	}
	

}
