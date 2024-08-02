package NewProblem;
import java.util.*;
public class practice1 {
	public static int RomanValue(String str) {
		 Map<Character,Integer> my = new HashMap<>();
			my.put('I', 1);
			my.put('V', 5);
			my.put('X', 10);
			my.put('L', 50);
			my.put('C', 100);
			my.put('D',500);
			my.put('M', 1000);
		
			int pvalue = 0;
			int result = 0;
			
			for(int i = str.length()-1;i>=0;i--){
				int curValue = my.get(str.charAt(i));
				
				if(curValue < pvalue) {
					result -= curValue;
					
				}
				else {
					result += curValue;
					
				}
				
				pvalue = curValue;
				
				
			}
			//System.out.println(result);
			

		return result;
	}

	public static  void main(String[] args) {
	   String str = "VL";
	   int flag = RomanValue(str);
	   System.out.println(flag);
	}

}
