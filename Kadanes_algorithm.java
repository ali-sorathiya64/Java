public class Kadanes_algorithm {

    public static void kadanes(int nums[]){
        int max =Integer.MIN_VALUE;
        int curr_value =0;

  for (int i=0 ;i<nums.length;i++){
    curr_value =curr_value+nums[i];
    if (curr_value< 0){
        curr_value =0;
    }

    max = Math.max(curr_value, max);
    for (int j =0; j<nums.length;j++){
        
    }
}
System.out.println("max value of the array is :"+max);


    }
       public static void main(String args[]){
  int nums []={-2,-4,-5,-6};
kadanes(nums);
        
       }



}
