import java.util.* ;
import java.io.*; 
public class Solution 
{
    public static void sort012(int[] arr)
    {
        //Write your code here
        int count0=0;
        int count1=0;
        int count2=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0)
            count0++;
            else if(arr[i]==1)
            count1++;
            else
            count2++;
        }
        int index=0;
        while(count0>0){
            arr[index]=0;
            count0--;
            index++;
        }
         while(count1>0){
            arr[index]=1;
            count1--;
            index++;
        }
         while(count2>0){
            arr[index]=2;
            count2--;
            index++;
        }
    }
}
