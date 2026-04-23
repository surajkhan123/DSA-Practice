package Strings;

public class Test4 {

  public static void main(String[] args) {
    String s ="AbCd";

    for(int i=0;i<=s.length()-1;i++){
      char ch = s.charAt(i);
      // if(ch>='A' && ch<='Z') //for uppercase
        if(ch>='a' && ch<='z')  //for lowercase
    System.out.println(ch);
    }
  }
}