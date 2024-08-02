package NewProblem;
public class Problem15 {

	public static void main(String[] args) {
		int [] arr = {19,20,18,1,2,4,21,9};
		int n = arr.length;
		int low = 0;
		int high = n-1;
		while(low < high) {
			int mid = low+(high  - low)/2;
			if(arr[mid]>arr[mid+1]) {
				high = mid;
			}
			else {
				low = mid+1;
			}
		}
		
		System.out.println(high);
	}

}
