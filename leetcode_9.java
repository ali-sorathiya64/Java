public class leetcode_9 {

    public static boolean palindrome_number(int x){
        while (x<0){
      return false;

        }
        
        int n =x;
        int rev=0;
while (n>0) {
    

        int last_digit = n%10;
        rev =(rev*10)+last_digit;
        n=n/10;
}
        if (rev==x){
             System.out.println("It's is a palindrome number");
            return true;
        }
        else{
             System.out.println("It's is not an palindrome number");
            return false;
        }
    

    }
    public static void main(String args[]){
        palindrome_number(111);
    }
}
