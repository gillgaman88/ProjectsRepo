package RevisionTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Fruit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
	List<String> list= new ArrayList<>();
	
	list.add("Banana");
	list.add("Kiwis");	
	list.add("Apple");
	
	System.out.println(list.contains("Kiwis"));
	System.out.println(list.contains("Grapes"));
	
	Map<Integer, String> Hashmap= new HashMap<>();
	Hashmap.put(1, "Real Madrid");
	Hashmap.put(2, "Barcelona");
	Hashmap.put(3, "Arsenal");

	System.out.println(Hashmap.containsKey(2));
	System.out.println(Hashmap.containsKey(1));
	System.out.println(Hashmap.containsValue("Arsenal"));
	System.out.println(Hashmap.containsValue("ManU"));
	
	
	}

}
