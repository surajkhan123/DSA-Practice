package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Pascal {
  public static void Pascal(int[][] a){
    for(int i=0;i<a.length;i++){
      a[i] =new int[i+1];

      for(int j=0;j<a.length;j++){
        if(j==0 || i==1)
          a[i][j]=1;
        else a[i][j] = a[i-1][j-1] + a[i-1][j];
      }
    }
  }
  public static void main(String[] args) {

    int n =5;
    int [][] arr = new int[n][];

    Pascal(arr);
    System.out.println(Arrays.deepToString(arr));

    
    

    for(int i=0;i<a.length;i++){
      a[i] = new int[i+1];
      for(int j=0;j< a[i].length;j++)
        if(j== 0 || i==j) a[i][j] =1;
      else a[i][j] = a[i-1][j-1];
    }
  }
}
