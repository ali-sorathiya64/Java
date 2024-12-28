import java.util.*;

public class reverse_number {

    public static void main(String args[]){

        Scanner sc =new Scanner(System.in);
        System.out.print("Enter any number you want to reverse :");
        int number =sc.nextInt();
        int rev=0;




    while (number>0) {
        int last_digit =number%10;
      rev= (rev*10)+last_digit;

         number =number/10;
    }
    System.out.println(rev);
    sc.close();
    }
    


    
}
