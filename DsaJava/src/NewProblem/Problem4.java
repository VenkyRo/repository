package NewProblem;

public class Problem4 {

	public static int FirstSearch(int[]arr,int traget) {
		int n = arr.length;
		int low = 0;
		int high = n-1;
		while(low <=high) {
			int mid = (low + high)/2;
			
			if(traget<arr[mid]) {
				high = mid-1;
			}
			else if (traget>arr[mid]) {
				low = mid+1;
			}
			else if(traget == arr[mid]) {
				if(mid == 0|| arr[mid-1]!=arr[mid]) {
					return mid;
				}
				else {
					high = mid-1;
				}	
			}
		}		
		return -1;
	}
	
	public static int LastSearch(int[] arr, int traget) {
		int n = arr.length;
		int low = 0;
		int high = n-1;
		while(low<=high) {
			int mid = (low + high)/2;
			if(traget >arr[mid]) {
				low = mid+1;
			}
			else if(traget < arr[mid]) {
				high  = mid -1;
			}
			else if(traget == arr[mid]) {
				if(mid ==0|| arr[mid+1]!= arr[mid]) {
					return mid;
				}
				else {
					low = mid+1;
				}
			}
		}
		return -1;
	}
	
	public static int[] SearchRange(int arr[],int traget) {
		int first = FirstSearch(arr,traget);
		if(first == -1) {
			return new int[]{-1,-1};
		}
		int last = LastSearch(arr,traget);
		
		
		return new int[] {first,last};
	}
	
	public static int CountSearch(int[]arr,int traget) {
		int First = FirstSearch(arr,traget);
		if(First == -1) {
			return 0;
		}
		int last = LastSearch(arr, traget);
			int count = last - First+1;
			return count;
		
	}
	public static void main(String[] args) {
		int arr[] = {10,20,20,20,30,40,40,40,50,60};
		int traget = 40;
		
		int [] flag = SearchRange(arr,traget);
		System.out.println(flag);
	}

}
