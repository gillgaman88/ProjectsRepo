package BasicJavaProgramming;

public class ExceptionJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

    try{
    int[] myNum= {0,1,2,3};
    System.out.println(myNum);
    }catch (Exception e){
    System.out.println("Something went wrong.");		
    	
    }finally {
    	System.out.println("The 'try catch' is finished");
    }
		
	}

}
