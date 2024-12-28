import java.util.*;


public class prime_number {

    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a number :");
        int number =sc.nextInt();


boolean is_prime =true;
for (int i =2; i<=number-1;i++){

    if (number % i == 0){
    is_prime=false;
    }
}
if (is_prime == true){
    System.out.println(number +":is a prime number");
}
    else{
        System.out.println( number +":is not a prime number");
  
}
sc.close();
    }
    
}
