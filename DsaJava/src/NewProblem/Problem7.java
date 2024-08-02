package NewProblem;

import java.util.Arrays;

public class Problem7 {
	// Bubble sort technique..
	public static void BubbleSort(int[] arr) {
		int n = arr.length;
		for(int p = 1;p<n;p++) {
			boolean swap = false;
			
			for(int j = 0;j<n-p;j++) {
				
				if(arr[j]>arr[j+1]) {
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
				swap = true;
				}
			}
			if(swap == false) {
				break;
			}
		}
	}

	public static void main(String[] args) {
		int [] arr = {30,6,20,2,12};
		System.out.println(Arrays.toString(arr));
		BubbleSort(arr);
		System.out.println(Arrays.toString(arr));

	}

}
