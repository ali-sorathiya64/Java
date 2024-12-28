import java.util.*;


public class patterns {

    public static void main(String args []){


        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        char ch ='A';

        for (int i =1; i<=n; i++){

            for (int nu =1; nu<=i; nu++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();

        }
        sc.close();
        
    }
    
}
