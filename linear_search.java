public class linear_search {

    public static int search(int arr[] ,int key){

        for (int i =0; i<=arr.length;i++){
            if (arr[i]==key){
                return i;

            }
          
        }
        return-1;

    }
    public static void main(String args []){

        int arr[]={19,20,21,23,24,25,45};
        int key =19;
        int index = search(arr, key);
        if (index == -1){
            System.out.println("value doesnot available in this series of array");
        }
        else{
            System.out.println("value is available in this array");
        }

    }
    
}
