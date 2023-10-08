package BasicJavaProgramming;

public class Encapsulation {

	public static class Vehicle {
	private String name;
	public char[] getName;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   
	Vehicle myObj=new Vehicle();
	myObj.name="BMW";
	System.out.println(myObj.name);
	}

	public void setName(String string) {
	// TODO Auto-generated method stub
	
	}
	}

    public static void main(String[] args){
    Vehicle myObj=new Vehicle();
    myObj.setName("Audi");
    System.out.println(myObj.getName);
    }
  }
  