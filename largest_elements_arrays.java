public class largest_elements_arrays {

    public static int largest_value(int numbers[])
   {
    int largest =Integer.MIN_VALUE;
     for (int i=0; i<numbers.length;i++){
        if(largest < numbers[i]){
            largest =numbers[i];
        }
        
    
     } 
     return largest;
    
   }
    public static void main(String args[]){
        int number[]={5,4,8,7,6};
        System.out.println("Largest value of an array is :"+largest_value(number));

    }
}
