package NewProblem;

import java.util.Arrays;
import java.util.Random;

public class Problem14 {
	public static void MergeSort(int[]arr,int low,int high) {
		if(low<high) {
			int mid = low+(high-low)/2;
			MergeSort(arr,low,mid);
			MergeSort(arr,mid+1,high);
			MergeFunction(arr,low,mid,high);
		}
		
	}
	
	public static void MergeFunction(int[] arr,int low,int mid,int high) {
		int m = mid-low+1;
		int n = high-mid;
		
		int a[] = new int[m];
		for(int i =0;i<m;i++) {
			a[i] = arr[i+low];
		}
		int b[] = new int[n];
		for(int j =0;j<n;j++) {
			b[j] = arr[j+mid+1];
		}
		
		int i =0;
		int j =0;
		int k =low;
		
		while(i<m&&j<n) {
			if(a[i]<=b[j]) {
				arr[k++] = a[i];
				i++;
			}
			else {
				arr[k++] = b[j];
				j++;
			}
		}
		
		while(i<m) {
			arr[k++] = a[i];
			i++;
		}
		while(j<n) {
			arr[k++] = b[j];
			j++;
		}
		
		
	}

	public static void main(String[] args) {
		//int[] arr ={9,2,3,7,8,4,6,5};
		Random rand = new Random();
		int arr[] = new int[10];
		int n = arr.length;
		for(int i = 0;i<n;i++){
			arr[i] = rand.nextInt(1,100);
		}
		
		
		int low = 0;
		int high = arr.length-1;
		System.out.println(Arrays.toString(arr));
		MergeSort(arr,low,high);
		System.out.println(Arrays.toString(arr));

	}

	

}
