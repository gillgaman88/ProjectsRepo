package RevisionTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Revision3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> Stuff= Arrays.asList(new String[]{"a","b"});
		List<String> list= new ArrayList<>(Stuff);
		 Stuff=Collections.unmodifiableList(list);

		 Set<String> set=new HashSet<>(Stuff);
		 set= Collections.unmodifiableSet(set);
		 
		Map<String, String> map=new HashMap<>();
		map=Collections.unmodifiableMap(map);
		
		System.out.println("Collections are read only");
		 
		 
	}

}
