public class RemoveDuplicate1 {
  public static void main(String[] args) {
    
    String s = "Life is roasting life";
    String[] words = s.split(" ");
    String result ="";

    for(String word: words){
      // if(!result.contains(word))

      if(!result.toLowerCase().contains(word.toLowerCase())) // skip case-sensitive
        
      {
        result += word+" ";
      }
    } System.out.println(result.trim());
  }
}
