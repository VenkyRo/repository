package NewProblem;

public class Problem5 {

	public static int FindPeak(int[] arr) {
		int n = arr.length;
		int low = 0;
		int high = n-1;
		while(low <high) {
			int mid = (low+high)/2;
			if(arr[mid]>arr[mid+1]) {
				high = mid;
			}
			else {
				low = mid+1;
			}
		}
		return low;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,11,8,2,18,20,6};
	
		int flag = FindPeak(arr );
		System.out.println(flag);

	}

}
