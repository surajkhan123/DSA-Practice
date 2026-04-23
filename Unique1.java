public class Unique1 {
  public static void main(String[] args) {
    String s = "Happy Happy Birthday to You";
    String[] words = s.split(" "); // split into words
    String result = "";

    for(String word : words){
      if(!result.contains(word)){
        result += word+" ";
      }
    }
    
    System.out.println(result.trim());
  }
}
