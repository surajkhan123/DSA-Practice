package Array;

public class SpiralMatrix2 {
  public static void main(String[] args) {
    int j=1;
    int[][] arr = new int[5][5];
    int left=0,top=0, right=arr.length-1, bottom = arr[0].length-1;

    while (left<=right && top<=right) {
      for(int i=left;i<=right;i++){
        arr[top][i] = j++;
      } top++;

      for(int i=top;i<=bottom;i++){
        arr[i][right]=j++;
      } right--;

      if(top<=bottom){
        for(int i=right;i>=left;i--){
        arr[bottom][i] = j++;
      } bottom--;

      }
      

      if(left<=right){
      for(int i=bottom;i>=top;i--){
        arr[i][left] = j++;
      } left--;
    }

    for(int i=0;i<arr.length;i++){
      for(int k=0; k<arr[i].length ;k++){
        System.out.print(arr[i][k]+"\t");
      }
    }

      // need to fix this code 
    }
  }
}
