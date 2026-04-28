package Array;

public class SecondMax {
  public static void main(String[] args) {
    int[] arr ={1,2,3,4,5};

  int max = Integer.MIN_VALUE;
  int second = Integer.MIN_VALUE;

  for(int num: arr){
    if(num > max){
      second = max;
      max = num;
    } else if(num>second && num != max){
      second = num;
    }
  }System.out.println(second);
  }
}
