import java.util.*;


public class patterns {

    public static void main(String args []){


        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number :");
        int n =sc.nextInt();
        char ch ='A';

        for (int i =1; i<=n; i++){

            for (int chars =1; chars<=i; chars++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();

        }
        sc.close();
        
    }
    
}
