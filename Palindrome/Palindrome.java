// len  = 7 -> middle = 7/2 = 3 

public class Palindrome {
  public static boolean isPalindrome(String s) {
    if (s==null) {
      return false; 
    }
   
    int start = 0;
    int end = s.length() - 1;

    while (start < end) {
      if (s.toLowerCase().charAt(start) != s.toLowerCase().charAt(end)) {
        return false;
      }
      start++;
      end--;

    }

    return true;
  }
}
