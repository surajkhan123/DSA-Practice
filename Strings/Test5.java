package Strings;

public class Test5 {
  public static void main(String[] args) {
    String s ="abc@123cd45";
    for(int i=0;i<s.length();i++){
      char ch = s.charAt(i);
      if(ch>='0' && ch<='9')
      System.out.println(ch);
    }
    
    
  }
}
