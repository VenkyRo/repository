
public class Problem1 {
	//Linear Search for iteration..
	public static int LinearSearch(int[]arr,int traget) {
		int n = arr.length;
		for(int i =0;i<n;i++) {
			if(traget == arr[i]) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = {12,34,53,32,98,31,76,88};
		int traget = 32;
		int result = LinearSearch(arr,traget);
		System.out.println(result);

	}

}
