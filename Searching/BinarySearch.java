package Searching;

public class BinarySearch {
  public static void main(String[] args) {
    int[] a = {10,20,30,40,50,60};
    System.out.println(find(a, 30));
    
  }
  public static int find(int[] a,int key){
    int st =0; int end = a.length-1;
    int mid = st + (end-st)/2;

    while (st<= end) {
      if(key == a[mid]) return mid;
      else if(key < a[mid]) return mid-1;
      else if(key > a[mid]) return mid + 1;
    }
    return -1;
  }
}
