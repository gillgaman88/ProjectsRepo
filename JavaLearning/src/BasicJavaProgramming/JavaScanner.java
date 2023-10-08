package BasicJavaProgramming;

import java.util.Scanner;

public class JavaScanner {
	

//	public static void main (String[] args){
//	Scanner myObj = new Scanner(System.in);
//	System.out.println("Enter Username");
//		
//	String username = myObj.next();
//	System.out.println("Username is:" +username);
//	
//	}
//	}
	
   public static void main(String[] args){
	   Scanner myObj = new Scanner(System.in);
	   System.out.println("Enter name, age, salary");
	   
	String Name = myObj.nextLine();
	int age = myObj.nextInt();
	double salary = myObj.nextDouble();
   
    System.out.println("Name:" +Name);
    System.out.println("age:" +age);
    System.out.println("salary:" +salary);
    
   }
   
}