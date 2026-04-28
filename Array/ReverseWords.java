package Array;

import java.util.Arrays;
import java.util.Collections;

public class ReverseWords {
  public static void main(String[] args) {
    String s ="I Love Coding";
    String[] words = s.split(" ");
    Collections.reverse(Arrays.asList(words));
    System.out.println(String.join(" ", words));
  }
}
