package NewProblem;

import java.util.Arrays;
import java.util.Random;

public class Problem13 {
	public static void BubbleSort(int[]a) {
		// Using BubbleSort Technique...
		System.out.println("BubbleSort Array....");
		int n1 = a.length;
		for(int i = 1;i<n1;i++) {
			boolean sw = false;
			for(int j = 0;j<n1-i;j++) {
				if(a[j]>a[j+1]) {
					Swaped(a,j,j+1);
					sw = true;
				}
				
			}
			if(sw == false){
				break;
			}
			
		}
	}
	
	public static void InserectionSort(int[]b) {
		// Using insertion sort technique...
		System.out.println("InserectionSort.....");
		int n2 = b.length;
		for(int i =0;i<n2;i++) {
			int key = b[i];
			int j = i-1;
			while(j>=0&&b[j]>key) {
				b[j+1] = b[j];
				j--;
			}
			b[j+1] = key;
			
		}
		
	}
	
	public static int[]  MergeSort(int[]a,int[]b) {
		// Merge Sort both a and b array...
		System.out.println("Mergesot.....");	
		int an = a.length;
		int bn = b.length;
		
		int i =0;
		int j = 0;
		int k = 0;
		int c[] = new int [an+bn];
		while(i<an&&j<bn) {
			if(a[i]<=b[j]) {
				c[k++] = a[i];
	        	i++;
			}
			else {
				c[k++] = b[j];
				j++;
			}
		}
		while(i<an) {
			c[k++] = a[i];
			i++;
		}
		while(j<bn) {
			c[k++] = b[j];
			j++;
		}
		//System.out.println(Arrays.toString(c));
		return c;
		
	}
	private static void Swaped(int[] a, int j, int i) {
		// Create a swap method.....
		int temp = a[j];
		a[j] = a[i];
		a[i] = temp;
	}
	
	public static int LinerSearch(int[]c,int target) {
		int cn = c.length;
		for(int i =0;i<cn;i++) {
			if(c[i]==target) {
				return i;
			}
		}
		return -1;
	}
	
	public static int BinarySearch(int[]c,int target) {
		int cn = c.length;
		int low = 0;
		int high = cn-1;
		while(low<high) {
			int mid = low+(high-low)/2;
			if(c[mid] == target) {
				return mid;
			}
			else if(target <c[mid]) {
				high = mid-1;
			}
			else {
				low = mid+1;
			}
		}
		
		return -1;
	}

	public static void main(String[] args) {
		Random rand = new Random();
		// Create a random array a..
		int[] a = new int[10];
		int an = a.length;
		for(int i =0;i<an;i++) {
			a[i] = rand.nextInt(1,100);
		}
		//System.out.println(Arrays.toString(a));
		//System.out.println();
		// Create a random array b....
		int[] b = new int[10];
		int bn = b.length;
		for(int j = 0;j<bn;j++) {
			b[j] = rand.nextInt(1,100);
		}
		//System.out.println(Arrays.toString(b));
		
		BubbleSort(a);
		// First Array....
		System.out.println(Arrays.toString(a));
		System.out.println();
		InserectionSort(b);
		// Second Array...
		System.out.println(Arrays.toString(b));
		System.out.println();
		long s = System.currentTimeMillis();
		MergeSort(a,b);
		//long e = System.currentTimeMillis();
		//System.out.println("Time taken : "+(e-s)+"Ms.......");
		int c[] = MergeSort(a,b);
		System.out.println(Arrays.toString(c));
		int target = 36;
		
		//int flag = LinerSearch(c,target);
		//System.out.println("Target found Using Linear Search : "+flag);
		
		System.out.println();
		int result = BinarySearch(c,target);
		System.out.println("Target Found Using Binary Search : "+ result);
		long e = System.currentTimeMillis();
		System.out.println("Time taken : "+(e-s)+"Ms.......");
		
		

	}

}