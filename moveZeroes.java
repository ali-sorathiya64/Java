public class moveZeroes {

    public static void movezeroes(int arr[]){
        int i =0;
        for ( int j =0; j<arr.length; j++){
            if (arr[j]!=0){
                int temp = arr[i];
                arr[i]= arr[j];
                arr[j]=temp;
                i++;
            }
        }
    }

    public static void printArray(int nums[]){
        for ( int i=0; i<nums.length ;i++){
            System.out.print(nums[i]+ " ");

        }
        System.out.println();
    }

    public static void main(String args[]){

        int arr []={0,11,12,0,15};
        movezeroes(arr);
        printArray(arr);

    }
}

