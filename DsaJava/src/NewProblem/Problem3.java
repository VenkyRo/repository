package NewProblem;
import java.util.Arrays;

public class Problem3 {
	//sorted array using binary search
	public static int BinarySearch(int[]arr,int traget) {
		Arrays.sort(arr);
		int start =0;
		int end = arr.length-1;
		while(start<end) {
			int mid = (start+end)/2;
			if(traget == arr[mid]) {
				return mid;
			}
			else if(traget<arr[mid]) {
				end = mid-1;
			}
			else if (traget>arr[mid]) {
				start = mid+1;
			}
		}
		
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = {12,34,63,64,54,33,56,87,98,65};
		int target = 87;
		long s = System.currentTimeMillis();
		int result = BinarySearch(arr,target);
		long e = System.currentTimeMillis();
		
		System.out.println(result);
		System.out.println("time taken: "+(e-s)+"Ms...");

	}

}
