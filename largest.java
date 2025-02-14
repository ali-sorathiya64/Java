public class largest {

    public static int maximum (int nums[]){
        int max  = Integer.MIN_VALUE;
        for ( int i =0; i<nums.length; i++){
            if (max < nums[i]){
                max = nums[i];
            }
        }
        System.out.println("maximum value of a array "+max);

        return max;
       
    }

    public static void main(String args[]){

        int arr []={10,20,30,41};
        maximum(arr);
        

    }
}
