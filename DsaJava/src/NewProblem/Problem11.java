package NewProblem;

import java.util.Arrays;
import java.util.Random;

public class Problem11 {
	
	public static void  SelectionSort(int[]arr) {
		int n = arr.length;
		for(int i = 0;i<n-1;i++) {
			int min = i;
			for(int j = i+1;j<n;j++) {
				if(arr[min]>arr[j]) {
					//min = j;
					swaped(arr,min,j);
				}
				
			}
		}

	}

	private static void swaped(int[] arr, int min, int j) {
		int temp = arr[min];
		arr[min] = arr[j];
		arr[j] = temp;
	}

	public static void main(String[] args) {
		//int [] arr = {10,2,4,5,3,1,9,7};
		//int[] arr = {35, 85, 13, 57, 30, 75, 64, 84, 68, 31};
		//int[] arr = {1, 15, 56, 97, 82, 46, 40, 95, 86, 14};
		Random rand = new Random();
		int [] arr = new int[10];
		for(int i = 0;i<arr.length;i++) {
			arr[i]  = rand.nextInt(1,100);
		}
		long s = System.currentTimeMillis();
		System.out.println(Arrays.toString(arr));
		SelectionSort(arr);
		System.out.println();
		System.out.println(Arrays.toString(arr));
		long e = System.currentTimeMillis();
		System.out.println("Taken time: "+(e-s)+"Ms....");
	}

}
