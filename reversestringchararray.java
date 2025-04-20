import java.util.* ;
import java.io.*; 
public class Solution {	
	public static String reverseString(String str) {
		// Write your code here.
		  char[] chars = str.toCharArray();
		  int left = 0;
		  int right = chars.length-1;
		  while(left<right){
			  char temp = chars[left];
			  chars[left]=chars[right];
			  chars[right]=temp;
			  left++;
			  right--;
		  }
		  return new String(chars);
	}
}
