package InterviewQuestions;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int fiblength;
	
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the number: ");
	fiblength= sc.nextInt();
	
	int[]num= new int[fiblength];
	
	num[0]=0;
	num[1]=1;
	
	for (int i=2; i<fiblength; i++){
	num[i]=num[i-1]+num[i-2];
	}
	
	System.out.println("FibonacciSeries");	
	for (int i=0;i<fiblength; i++){
	System.out.println(num[i]+ "");	
	}
	
	}

}
