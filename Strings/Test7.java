package Strings;

public class Test7 {
  public static void main(String[] args) {
    String s = "Madam";
    String rev ="";

    for(int i=s.length()-1;i>=0;i--){
      char ch = s.charAt(i);
      rev +=ch;

    }
    if(s.equals(rev)) System.out.println("Palindrome string");
    else System.out.println("Not Palindrome String");
  }
}
