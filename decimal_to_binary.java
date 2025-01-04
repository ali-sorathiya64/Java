import java.util.*;

public class decimal_to_binary {

public static int dec_number(int n){

int binary_num =0;
int my_num =n;
int pow=0;
while (n>0){
    int reminder=n%2;
    binary_num =binary_num+(reminder * (int)Math.pow(10,pow ));
    pow++;
    n=n/2;

}
System.out.println("Bianry form of + :"+my_num+":"+ binary_num);
return binary_num;

}

    public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter a number :");
            int number =sc.nextInt();
        dec_number(number);

        sc.close();

    }

}
