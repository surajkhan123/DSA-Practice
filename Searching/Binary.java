package Searching;

public class Binary {
  public static void main(String[] args) {
    int[] a ={10,20,30,40,50};
    System.out.println(find(a, 30));
  }
  public static int find(int[]a,int key){
    int st =0, end = a.length-1;
    int mid = st+(end-st)/2;

    while (st<=end) {
      if(a[mid] == key) return mid;
      else if (a[mid] < key) {
        return mid -1;
      }
      else return mid+1;
    }
    return -1;




  }
}
