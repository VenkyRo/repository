package NewProblem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.*;

public class lettcode1 {

	public static int removeElement(int[] nums, int val) {
		int count = 0;
		for(int i =0;i<nums.length;i++) {
			if(nums[i]!=val) {
				count++;
			}
		}
		return count;
        
    }
	public static void main(String[] args) {
		int[] nums = {3,2,2,3};
		int val = 3;
		int flag = removeElement(nums,val);
		System.out.println(flag);
		

	}

}
