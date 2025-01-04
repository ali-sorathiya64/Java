import java.util.Scanner;

public class binary_to_decimal {
    public static void binary_num(int num){
        int dec_num=0;
        int binaryNum = num;
        int pow=0;
        while (num>0) {
            int last_digit =num%10;
            dec_num =dec_num +(last_digit  * (int) Math.pow(2,pow));
            
pow++;
num =num/10;
            
        }

         System.out.println("Decimal conversion is "+binaryNum +":"+ dec_num);
      
    }


  

    public static void main(String args[]){
        System.out.print("Enter a number : ");
        Scanner sc =new Scanner(System.in);
        int number =sc.nextInt();
    
       binary_num(number);
 
        

    }
    
}
