package Strings;

public class Test3 {
  public static void main(String[] args) {
    String s="suraj";
    String rev=" ";

    for(int i=s.length()-1;i>=0;i--)
      rev += s.charAt(i);
      System.out.println("String: "+s);
      System.out.println("Reverse: "+rev);
  }
}
