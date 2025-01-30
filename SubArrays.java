
import java.util.*;
public class SubArrays {

     public static void sub_Array(int nums[]){
    int curr_sum=0;
    int max = Integer.MIN_VALUE;
    for (int i =0; i<nums.length; i++){
        for (int j =i; j<nums.length;j++){
            curr_sum=0;
            for (int k=i; k<=j;k++){
                curr_sum += nums[k];
            }
            System.out.println(curr_sum);
            if (max <curr_sum){
                max =curr_sum;
            }
        }}
        System.out.println("subarray sum of the array is :"+ max);
    }
    public static void main(String args[]){
        int arr[] ={2,4,6,8,10};
       sub_Array(arr);

    
}}