package Strings;

public class Test9 {
  public static boolean isPalindrome(String s){
    int left =0, right = s.length()-1;

    while (left<right) {
      if(s.charAt(left) != s.charAt(right))
        return false;
      left++;
      right--;
    }
    return true;

  }
  public static void main(String[] args) {
    String s = "madam";

    for(int i=0;i< s.length();i++){
      for(int j=i+1;j<= s.length();j++){
        String sub = s.substring(i, j);
        if(isPalindrome(sub)) 
          // if(sub.length() > 1 && isPalindrome(s))  // ti print big palindrome 
          System.out.println(sub);
      }
    }    
  }
}
