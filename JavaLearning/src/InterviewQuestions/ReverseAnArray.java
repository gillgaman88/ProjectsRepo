package InterviewQuestions;

public class ReverseAnArray {

	public static void main(String[] args) {
    // TODO Auto-generated method stub
    
		String[] Array= {"ai","bi","ci","di","ei","fi","hi","ii","gill"};
		int right=Array.length-1;
		int left=0;
		
		while (left<right){
		String c= Array[left];
		Array[left]=Array[right];
		Array[right]=c;
		
		left +=1;
		right-=1;
		}
		
		for (int i=0;i<Array.length;i++){
			System.out.println(Array[i]);
		}
	}
	}

