package Strings;

public class Test13 {

  public static void main(String[] args) {
    String s1 = "java developer";
    int c = s1.length() - s1.replace("a", "").length();
    System.out.println(c);

  }
}