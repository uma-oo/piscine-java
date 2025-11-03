
public class Palindrome {
    public static boolean isPalindrome(String s) {
        // your code here
      String firstHalf  =  s.substring(0, s.length()/2+1); 
      String secondHalf  = new StringBuilder(s.substring(s.length()/2, s.length())).reverse().toString(); 
      return  firstHalf.equals(secondHalf); 
    }
}