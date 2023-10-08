package InterviewQuestions;

public class SumAllDigits {
	
	public static int getSumofalltheDigits(int num){
		
	 int sum =0;
	
	 while(num!=0){
	 int rem= num %10;
	 sum=sum+rem;
	 num=num/10;
	}
	return sum;
	
}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println(getSumofalltheDigits(539456));
		
	}

}
