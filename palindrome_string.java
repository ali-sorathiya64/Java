public class palindrome_string {

   
    

public static boolean isPalindrome(String s){




s=s.toLowerCase().replaceAll("[^A-Za-z0-9]","");

for ( int i = 0 ; i<s.length()/2; i++){

    if (s.charAt(i)!= s.charAt(s.length()-1-i)){

        return false;
    }

   

}
return true;



} public static void main(String args[]){

    String str = "racecar";
     System.out.println(isPalindrome(str));
    
     

}
}