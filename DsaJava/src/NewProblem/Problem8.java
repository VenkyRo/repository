package NewProblem;
import java.util.Arrays;
import java.util.Random;


public class Problem8 {
	
	
	public static void BubbleSort(int[] arr) {
		int n = arr.length;
		for(int p = 1;p<n;p++) {
			boolean sw = false;
			
			for(int j = 0;j<n-p;j++) {
	
				if(arr[j]>arr[j+1]) {
					swaped(arr,j,j+1);
					sw = true;
					
				}
			}
			if(sw == false) {
				break;
			}
		}
		
	}

	public static void swaped(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

	public static void main(String[] args) {
		
		Random rand = new Random();
		int[] arr = new int[10];
		int n = arr.length;
		for(int i =0;i<n;i++) {
			arr[i] = rand.nextInt(1,10);
		}
		System.out.println(Arrays.toString(arr));
		long  start = System.currentTimeMillis();
		
	    System.out.println("==================================================================================================");
		BubbleSort(arr);
		long end = System.currentTimeMillis();
		System.out.println("Taken time: "+ (end-start)+"Ms..");
		System.out.println("==================================================================================================");
		System.out.println(Arrays.toString(arr));
		

		
	}

}
