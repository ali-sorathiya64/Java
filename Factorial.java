import java.util.*;

public class Factorial {

 public static int factorial ( int n){
  int f =1;
  for (int i =1; i<=n; i++){
  f = f*i;

  }
  return f;
 }
 

 

    public static void main(String args[]){
      Scanner sc =new Scanner(System.in);
      System.out.print("Enter a number :");
     
       int number=sc.nextInt();

    
    System.out.println( "Factorial of a number is :"+ factorial(number));
  

       sc.close();
    
}

}