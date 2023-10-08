package InterviewQuestions;

public class LongestConsecutiveOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int[] array={34,4,56,67,78,8,98,35,3,1,44,23};
	int count=0;
	int max=0;
	
	for(int i=0;i<array.length+1;i++){
	if(array[i]+1== array[i+1]){
		count++;
	}else{
		count=0;
	}

	 max=Math.max(max, count+1);
	}
    System.out.println(max);
}
}