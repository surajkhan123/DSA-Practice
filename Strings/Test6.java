package Strings;

public class Test6 { // count upper case, lower case, number case, special case
  public static void main(String[] args) {
    String s = "Suraj@123#K"; int uc=0,lc =0,sc=0,nc=0;
    for(int i=0;i<s.length();i++){
      char ch = s.charAt(i);

      if     (ch>='A' && ch<='Z') uc++;
      else if(ch>='a' && ch<='z') lc++; 
      else if(ch>='1' && ch<='9') nc++;
      else                        sc++;
      
    }
    System.out.println("Upper Case: "+uc);
    System.out.println("Lower Case: "+lc);
    System.out.println("Number Case: "+nc);
    System.out.println("Special Case: "+sc);
  }
}
