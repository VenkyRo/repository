package NewProblem;

import java.util.Arrays;

public class Test13 {
	public static void SqureMat(int [] arr) {
		int n = arr.length;
		
		for (int i =0; i<n;i++) {
			arr[i] += Math.pow(arr[i],2);
		}
	}
	
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
		int arr [] = {5,2,4,1,3};
		System.out.println(Arrays.toString(arr));
		SqureMat(arr);
		System.out.println(Arrays.toString(arr));
		BubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	

}
