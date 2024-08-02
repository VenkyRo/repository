package NewProblem;

public class Problem6 {
	public static int SearchTraget(int[] arr, int traget) {
		// Binary search technique..
		int low = 0;
		int high = arr.length-1;
		while(low<high) {
			int mid = (low + high)/2;
			if(traget == arr[mid]) {
				return mid;
			}
			if(arr[mid]>= arr[low]) {
				if(traget >= arr[low]&& traget <= arr[mid]) {
					high = mid-1;
				}
				else {
					low = mid+1;
				}
				
			}else {
				if( traget>= arr[mid]&&traget<=arr[high]) {
					low = mid+1;
				}
				else {
					high = mid-1;
				}
				
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		//int arr[] = {30,40,50,60,70,10,20};
		int arr[] = {60,70,10,20,30,40,50};
		int traget = 50;
		int result = SearchTraget(arr,traget);
		System.out.println(result);

	}

}
