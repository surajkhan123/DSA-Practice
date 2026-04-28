package Strings;

public class Test10 {
  
  public static boolean isPalindrome(String s, int left,int right){
    int i=left, j=right;

    while (i<j) {
      if(s.charAt(i) != s.charAt(j))
        return false;
      i++;
      j--;
    }
    return true;

  }
  public static void main(String[] args) {
    String s = "madam";

    for(int i=0;i< s.length()-1;i++){
      for(int j=i+1;j< s.length();j++){
        // String sub = s.substring(i, j);
        if(isPalindrome(s, i,j)) 
          // if(sub.length() > 1 && isPalindrome(s))  // if print big palindrome 
          System.out.println(s.substring(i, j+1));
      }
    }    
  }
}

