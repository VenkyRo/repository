package NewProblem;

public class test12 {
	
	public static void countNum(int[] arr) {
		int count = 1;
		int newcount = 1;
		int low = 0;
		int high = low+1;
		//int len = arr.length-1;
		while(low<high) {
			if(arr[low]== arr[high]) {
				count++;
			}
			else {
		           high = low;
			}
			
		}
		System.out.println(count+"\t"+newcount);
		
		
	}

	public static void main(String[] args) {
		int [] arr = {2,2,2,1,1,1,4,4,5};
		countNum(arr);
	}

}
