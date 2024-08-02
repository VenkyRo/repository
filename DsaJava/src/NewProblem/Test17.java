package NewProblem;


public class Test17{
	
	 public static boolean search(int[] nums, int target) {
		 
		 int n = nums.length;
		 
		 int low = 0;
		 int high = n-1;
		 
		 while(low<=high) {
			 int mid = low+(high - low)/2;
			 
			 if ( nums[mid] == target) {
				 return true;
			 }
			 
			 if (nums[low] == nums[mid]) {
				 low++;
				 continue;
			 }
			
			 if(nums[low]<nums[mid]) {
				 if(nums[low]<= target&&target<nums[mid]) {
					 high = mid -1;
				 }
				 else {
					 low = mid+1;
				 }
				 
			 }
			 else {
				 if(nums[mid]< target && target<=nums[high]) {
					 low = mid+1;
				 }
				 else {
					 high = mid-1;
				 }
			 }
			 
		 }
	         
		 return false;
	        
	    }

public static void main(String ar[]){
	int arr[] = {1,0,1,1,1};
	int target = 0;
	boolean flag = search(arr, target);
	System.out.println(flag);



}

}