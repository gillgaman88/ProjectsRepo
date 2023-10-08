package InterviewQuestions;

public class SwapTwoStrings {

	//Write a Java Program to swap two given Strings
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
	String S1="Gamanjit Singh";
	String S2="Gill";
	
	S1=S1+S2;
	//Substring Method
	S2=S1.substring(0, S1.length()-S2.length());
	S1=S1.substring(S2.length());
	
	System.out.println("Check the second name " +S1);
	System.out.println("Check the first name " +S2);
	
		
	}

}
