public class duplicates_in_array {


    public static boolean duplicate(int nums[]){

        for (int i =0; i<nums.length;  i++){
        
      for (int j =i+1; j<nums.length; j++){
        if (nums [i] == nums [j]){
            return true;
        }
      }

        }
        return false;

    }
    public static void main(String args[]){
        int nums []={10,40,20,30};

    
System.out.println("Duplicate in arry  is "+duplicate(nums));
    
    
    }
    
}
