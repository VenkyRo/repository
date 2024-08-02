package NewProblem;

import java.util.Arrays;
import java.util.Random;

public class Problem12 {
	
	public static void BubbleSort(int[] arr1) {
		int n = arr1.length;
		for(int i =1;i<n;i++) {
			boolean sw = false;
			for(int j =0;j<n-i;j++) {
				if(arr1[j]>arr1[j+1]) {
					swaped(arr1,j,j+1);
					sw = true;
				}
			}
			if(sw == false) {
				break;
			}
		}
		
	}

	private static void swaped(int[] arr1, int j, int i) {
		int temp = arr1[j];
		arr1[j] = arr1[j+1];
		arr1[j+1] = temp;
	}
	
	
	
	public static void  SelectionSort(int[]arr3) {
		int n = arr3.length;
		for(int i = 0;i<n-1;i++) {
			int min = i;
			for(int j = i+1;j<n;j++) {
				if(arr3[min]>arr3[j]) {
					swaped(arr3,min,j);
				}
			}
		}
		
		
	}
	
	
	public static void InserctionSort(int[] arr2) {
		// Sorted given array using Inserction Sort technique...
		int n = arr2.length;
		for(int i =0;i<n;i++) {
			int key = arr2[i];
			int j = i-1;
			while(j>=0&& arr2[j]>key) {
				arr2[j+1] = arr2[j];
				j--;
			}
			 arr2[j+1] = key;
		}
		
	}
	

	public static void main(String[] args) {
		Random rand = new Random();
		
		
		int [] arr1 = new int[10];
		int n = arr1.length;
		for(int i =0;i<n;i++) {
			arr1[i] = rand.nextInt(1,100);
		}
		long s = System.currentTimeMillis();
		System.out.println("Bubble Sort....");
		System.out.println(Arrays.toString(arr1));
		BubbleSort(arr1);
		System.out.println("Bubble Sort soted Array...");
		System.out.println(Arrays.toString(arr1));
		long e = System.currentTimeMillis();
		System.out.println("Time taken:"+(e-s)+"Ms......");
		
		System.out.println();
		
		
		
		int [] arr2 = new int[10];
		int n1 = arr2.length;
		
		for(int j = 0;j<n1;j++) {
			arr2[j] = rand.nextInt(1,100);
		}
		
		
		long s1 = System.currentTimeMillis();
		System.out.println("Inserction sort");
		System.out.println(Arrays.toString(arr2));
	    InserctionSort(arr2);
		System.out.println("Insetction Sort sorted....");
		System.out.println(Arrays.toString(arr2));
		long e1 = System.currentTimeMillis();
		System.out.println("Time taken:"+(e1-s1)+"Ms......");
		
		System.out.println();
		
		int [] arr3 = new int[10];
		int n2 = arr3.length;
		
		for(int k = 0;k<n2;k++) {
			arr3[k] = rand.nextInt(1,100);
		}
		
		
		long s2 = System.currentTimeMillis();
		System.out.println("Selection sort");
		System.out.println(Arrays.toString(arr3));
	    SelectionSort(arr3);
		System.out.println("Selection Sort sorted....");
		System.out.println(Arrays.toString(arr3));
		long e2 = System.currentTimeMillis();
		System.out.println("Time taken:"+(e2-s2)+"Ms......");

		
		
	}
	
}
