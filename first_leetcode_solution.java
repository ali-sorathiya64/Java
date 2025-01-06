
import java.util.Arrays;

public class first_leetcode_solution {

  
    public static int[]two_sum(int [] nums, int target){
         for (int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length;j++){
                if(nums[i]+nums[j]== target){
                    return new int[]{i,j};
                }
            }
         }
         return null;

    }

    public static void main (String args[]){

        int arr[]={10,20,4,5};
        int target =9;
      int result[]=two_sum(arr, target);
      System.out.println(
        "Indices is :"+Arrays.toString(result)
      );
        

    }

    
}