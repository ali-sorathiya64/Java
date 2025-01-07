public class largest_elements_arrays {

    public static int largest_value_smallest_value(int numbers[])
   {
    int largest =Integer.MIN_VALUE;
    int smallest =Integer.MAX_VALUE;
     for (int i=0; i<numbers.length;i++){
        if(largest < numbers[i]){
            largest =numbers[i];
        }
        if (smallest> numbers[i]){
            smallest =numbers[i];
        }
        
        
     } 
     System.out.println("Smallest element of an array is :"+smallest);
   System.out.println("Largest element of an array is :"+largest);
     return largest;
    
   }
    public static void main(String args[]){
        int number[]={5,4,8,7,6};
    int value = largest_value_smallest_value(number);
        

    }
}
