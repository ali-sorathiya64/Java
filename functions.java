//function overloading


import java.util.*;

public class functions {


    public static int sum(int a ,int b,int c){
        return a+b+c;
       
    }
    public static int sum(int a ,int b){
        return a+b;
       
    }
    public static float sum(float a ,float b,float c){
        return a+b+c;
       
    }
    public static void main (String args[]){

System.out.println("Sum of three number is :"+(sum(20,30,40)));

System.out.println("Sum of two number is :"+(sum(5000,30)));

System.out.println("Sum of three number is :"+((sum(20.44f,30.55f,50.66f))));
    }
      
}
