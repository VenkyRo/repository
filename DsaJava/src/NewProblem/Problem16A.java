package NewProblem;

import java.util.Arrays;

public class Problem16A {
	

	private static void QuickSort(int[] arr, int lowIndex, int highIndex) {
		if(lowIndex>=highIndex) {
			return;
		}
	    int pivot = arr[highIndex];
		int leftPointer = partation(arr, lowIndex, highIndex, pivot);
		QuickSort(arr,lowIndex,leftPointer -1);
		QuickSort(arr,leftPointer+1,highIndex);
		
	}



	private static int partation(int[] arr, int lowIndex, int highIndex, int pivot) {
		int leftPointer = lowIndex;
		int rightPointer = highIndex;
		while(leftPointer<rightPointer) {
			while(arr[leftPointer]<=pivot&&leftPointer<rightPointer) {
				leftPointer++;
			}
			while(arr[rightPointer]>= pivot&&leftPointer<rightPointer) {
				rightPointer--;
			}
			swap(arr,leftPointer,rightPointer);
		}
		swap(arr,leftPointer,highIndex);
		return leftPointer;
	}

	

	private static void swap(int[] arr, int left, int right) {
		// TODO Auto-generated method stub
		int temp = arr[left];
		arr[left] = arr[right];
		arr[right] = temp;
		
		
	}

	public static void main(String[] args) {
		int arr []  = {3,6,2,5,8,9,7,4};
		int lowIndex = 0;
		int highIndex = arr.length-1;
		System.out.println(Arrays.toString(arr));
		QuickSort(arr,lowIndex,highIndex);
		System.out.println(Arrays.toString(arr));

	}

}
