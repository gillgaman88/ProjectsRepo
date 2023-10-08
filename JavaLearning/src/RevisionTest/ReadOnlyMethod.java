package RevisionTest;

public class ReadOnlyMethod {

	private static String FruitName="Apple";
	
	public static String getFruitName(){
		return FruitName;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReadOnlyMethod fruit= new ReadOnlyMethod();
      String result=fruit.getFruitName();
      System.out.println(result);
	}

}
