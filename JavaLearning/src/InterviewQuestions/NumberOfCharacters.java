package InterviewQuestions;

import java.util.HashMap;

public class NumberOfCharacters {
static void characterCount(String inputString){
	HashMap<Character, Integer> Hash_map= new HashMap<>();
	char[] strArray=inputString.toCharArray();
	for (char c: strArray){
	if (Hash_map.containsKey(c)){	Hash_map.put(c, Hash_map.get(c)+1);
	}
	else{
	Hash_map.put(c, 1);
	}
	}

	System.out.println(Hash_map);
}
	public static void main(String[] args){
	characterCount("HarpreetKaurGill");
	}
}


