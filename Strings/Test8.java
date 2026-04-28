package Strings;

public class Test8 {
  public static boolean isPalindrome(String s){
    int left =0, right =s.length()-1;

    while (left <right) {
      if(s.charAt(left) != s.charAt(right))
        return false;
    left++;
    right--; 
    }
    return true;
  }
  public static void main(String[] args) {
    String s = "madam";
    if(isPalindrome(s)){
      System.out.println("Palindrome String: "+s);
    }else {
      System.out.println("Not Palindrome String "+s);}

    
  }

}
