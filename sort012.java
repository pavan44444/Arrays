import java.util.* ;
import java.io.*; 
public class Solution 
{
    public static void sort012(int[] arr)
    {
        //Write your code here
        List<Integer> zero_list = new ArrayList<>();
          List<Integer> one_list = new ArrayList<>();
            List<Integer> two_list = new ArrayList<>();
            int list_length = arr.length;
            for(int i=0;i<list_length;i++){
                if(arr[i]==0){
                    zero_list.add(arr[i]);
                }
                 else if(arr[i]==1){
                    one_list.add(arr[i]);
                }
                  else
                    two_list.add(arr[i]);
                
            }
        int zero_list_size = zero_list.size();
        int one_list_size = one_list.size();
        int two_list_size = two_list.size();
        int index=0;
        for(int i=0;i<zero_list_size;i++){
            arr[index++]=zero_list.get(i);
        }
         for(int i=0;i<one_list_size;i++){
            arr[index++]=one_list.get(i);
        }
         for(int i=0;i<two_list_size;i++){
            arr[index++]=two_list.get(i);
        }
    
    }
}
