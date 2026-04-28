package Strings;

public class ArrangeString {
  public static void main(String[] args) {
    String s = "Abc@123d";
    int uc =0, lc=0, nc =0;
    for(int i=0;i< s.length();i++){
      char ch = s.charAt(i);

      if(ch>='A' && ch<='Z' ) uc +=ch;
      else if(ch>='a' && ch<='z' ) lc +=ch;
      else if(ch>='0' && ch<='9' ) nc +=ch;
      else sc+;

      }
  }
}
