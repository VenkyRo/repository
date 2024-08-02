package NewProblem;

import java.util.Arrays;
import java.util.Random;

public class Problem9 {
	public static int LinearSearch(int[] arr,int traget) {
		// Linear Search.find target in given array..
		int n = arr.length;
		for(int i =0;i<n;i++) {
			if(arr[i]==traget) {
				return i;
			}
		}
		return -1;
	}
	
	public static int BinarySearch(int[] arr,int target) {
		// Find the target using Binary search technique....
		int n = arr.length;
		int low = 0;
		int high = n-1;
		while(low<high) {
			int mid = (low + high)/2;
			if(target == arr[mid]) {
				return mid;
			}
			else if(target>arr[mid]) {
				low = mid+1;
			}
			else {
				if(target < arr[mid]) {
					high = mid-1;
				}
			}
		}
	
		return -1;
	}
	
	public static void BubbleSort(int[] arr) {
		//Sort array using  Bubble Sort technique....
		int n = arr.length;
		for(int p = 1;p<n;p++) {
			boolean sw = false;
			for(int j =0;j<n-p;j++) {
				if(arr[j]>arr[j+1]) {
					swapMethod(arr,j,j+1);
					sw = true;
				}
			}
			if(sw == false) {
				break;
			}
		}
	}
	
	
	

	private static void swapMethod(int[] arr, int a, int b) {
		// Swap two numbers..
		int temp= arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	
	

	public static void main(String[] args) {
		// create a Random array...
		Random rand = new Random();
		int[] arr = new int[100];
		int n = arr.length;
		for(int i =0;i<n;i++) {
			arr[i] = rand.nextInt(1,100);
		}
		System.out.println(Arrays.toString(arr));
		
		BubbleSort(arr);
		System.out.println();
		long start = System.currentTimeMillis();
		System.out.println(Arrays.toString(arr));

		int traget = 30;
		System.out.println();
		
		
		// find target using Binary search...
		int flagBinary = BinarySearch(arr, traget);
		// Method Call Binary Search...
		System.out.println("Find Target using BinarySearch: "+flagBinary);
		long end = System.currentTimeMillis();
		// Time taken for find to target... using Binary Search technique...
		System.out.println("Time taken using BinarySearch :"+(end-start)+"Ms...");
		
		
		System.out.println();
		// Method Call Linear Search...
		int flagLinear = LinearSearch(arr, traget);
		System.out.println("Find traget using LinearSearch: "+flagLinear);
		long end1 = System.currentTimeMillis();
		// Time taken for find to target... using Linear Search technique...
		System.out.println("Time taken using LinearSearch:"+(end1-start)+"Ms...");
		
	
		
	}

}
