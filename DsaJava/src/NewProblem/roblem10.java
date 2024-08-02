package NewProblem;

import java.util.Arrays;

public class roblem10 {
	public static void InserctionSort(int[] arr) {
		// Sorted given array using Inserction Sort technique...
		int n = arr.length;
		for(int i =0;i<n;i++) {
			int key = arr[i];
			int j = i-1;
			while(j>=0&& arr[j]>key) {
				arr[j+1] = arr[j];
				j--;
			}
			 arr[j+1] = key;
		}
		
	}

	public static void main(String[] args) {
		int[] arr = {9,3,2,5,8,6,1,4};
		long s = System.currentTimeMillis();
		System.out.println(Arrays.toString(arr));
		InserctionSort(arr);
		System.out.println(Arrays.toString(arr));
		long e = System.currentTimeMillis();
		System.out.println("Taken time: "+(e-s)+"Ms....");
		

	}

}
