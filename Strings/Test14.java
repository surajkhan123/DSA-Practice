package Strings;

public class Test14 {
  public static void main(String[] args) {
    String s1 = "cococola";
    String s2 = "";

    while (s1.length() > 0) {
      char ch = s1.charAt(0);
      int n = s1.length() - s2.length();
      System.out.println(ch+"="+n);
      s1=s2;
    }
  }
}
