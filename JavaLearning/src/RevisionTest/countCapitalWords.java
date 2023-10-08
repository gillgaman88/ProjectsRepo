package RevisionTest;

public class countCapitalWords {

	public static int getcountCapitalWords(String inputString){
		int counter=0;
		for (int i=0;i<inputString.length();i++){
		if (inputString.charAt(i)>='a' && inputString.charAt(i)<='z'){
		counter++;	
		}
		}
	    return counter;
	}
	
	public static void main(String[] args) {
	System.out.println(getcountCapitalWords("ObtainTheMaximumValueBetweenTheMaxAndTheCounterVariable"));
	}

}
