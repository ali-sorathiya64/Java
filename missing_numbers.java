public class missing_numbers {

    public  static int missing_nums(int nums[]){
        int n =nums.length;
        int missingNumber =n*(n+1)/2;
        int actual_sum =0;
       for ( int i=0; i<n ;i++){
        actual_sum += nums[i];
       }
return missingNumber - actual_sum;

    }
    public static void main(String args[]){


        int nums_array  []={1,2,3};
       System.out.println( missing_nums(nums_array));
    }
}
