package InterviewQuestions;

import java.util.HashMap;
import java.util.Set;

public class DuplicateString {
	static void duplicateString(String inputString){
		HashMap<Character, Integer>Hash_map= new HashMap<>();
		char[] strArray=inputString.toCharArray();
		
		for(char c:strArray){
			if (Hash_map.containsKey(c)){
			Hash_map.put(c, Hash_map.get(c)+1);
			}
			else{
			Hash_map.put(c, 1);
			}
		}
	Set<Character> keys=Hash_map.keySet();
	for (char c1:keys){
		if(Hash_map.get(c1)>1){
			System.out.println(c1+"--->"+Hash_map.get(c1));
		}
	}
	}
	public static void main(String[] args){
		duplicateString("The above program will print all the duplicates in the given String in the console.");
	}
	}
	

