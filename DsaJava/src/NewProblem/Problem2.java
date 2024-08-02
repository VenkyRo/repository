package NewProblem;

public class Problem2 {
	public static int LinearSearch(int[]arr,int traget,int size) {
		if(size ==0) {
			return -1;
		}
		if(traget == arr[size]) {
			return LinearSearch(arr,traget,size);
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = {12,34,53,32,98,31,76,88};
		int traget = 12;
		int size = arr.length-1;
		int result = LinearSearch(arr,traget,size);
		System.out.println(result);
	}

}
