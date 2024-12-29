import java.util.*;

public class Factoril {

 public static int factorial ( int n){
  int f =1;
  for (int i =1; i<=n; i++){
  f = f*i;

  }
  return f;
 }
  

    public static void main(String args[]){
      System.out.print("Enter a number");
      Scanner sc =new Scanner(System.in);
       int number=sc.nextInt();
       System.out.print(factorial(number)+"");

       sc.close();
    
}

}