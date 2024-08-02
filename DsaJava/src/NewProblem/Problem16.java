package NewProblem;

import java.util.Arrays;

public class Problem16 {
	
	private static void QuickSort(int[] arr, int lowIndex, int highIndex) {
		int pivot = arr[highIndex];
		int i = lowIndex-1;
		for(int j = lowIndex;j<=highIndex;j++) {
			if(arr[j]<= pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		
	}

	public static void main(String[] args) {
		int arr []  = {3,6,2,5,8,9,7,4};
		int lowIndex = 0;
		int highIndex = arr.length-1;
		//System.out.println(Arrays.toString(arr));
		QuickSort(arr,lowIndex,highIndex);
		System.out.println(Arrays.toString(arr));
		

	}



}
