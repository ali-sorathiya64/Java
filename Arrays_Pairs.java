public class Arrays_Pairs {
    public static void pairs(int number[]){

        for (int i =0; i<number.length;i++){
            int current = number[i];
            for (int j=i;j<number.length;j++){

                System.out.print("("+current+","+number[j]+")");
            }
System.out.println();
        }


    }
    public static void main(String args[]){
        int nums[]={2,4,6,8,10};
        pairs(nums);


    }
}
