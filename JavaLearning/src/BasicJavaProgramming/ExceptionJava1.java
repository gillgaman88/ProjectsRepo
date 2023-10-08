package BasicJavaProgramming;

public class ExceptionJava1 {

	static void checkAge(int age) {
    	if (age < 18) {
    	throw new ArithmeticException("Access Denied - You must be at least 18 years old");	
    	}
    	else{
       System.out.println("Access Denied- You are old enough!");
    	}
    }	
     		
	public static void main(String[] args) {
			// TODO Auto-generated method stub
	checkAge(15);    	
	}

}
