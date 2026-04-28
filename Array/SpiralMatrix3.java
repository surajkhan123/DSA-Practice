package Array;

public class SpiralMatrix3 {

  public static void main(String[] args) {
    // 1  2   3   4    5
    // 16 17  18  19   6 
    // 15 24  25  20   7
    // 14 23  22  21   8
    // 13 12  11  10   9
    int j=1; int n = 5;
    int[][] arr = new int[n][n];
    int left=0, top =0, right =arr.length-1, bottom = arr[0].length-1; 
    while(left<=right && top<=bottom){
      for(int i=left;i<=right;i++){
        arr[top][i]=j++;
      } top++;

      for(int i=top;i<=bottom;i++){
        arr[i][right] = j++;
      }right--;

      if(top<=bottom){
      for(int i=right;i>=left;i--){
        arr[bottom][i]=j++;
      } bottom--;
    }

    if(left<=right){
      for(int i=bottom;i>=top;i--){
        arr[i][left]=j++;
      } left++;
    }


    }
    for(int i=0;i<arr.length;i++){
      for(int k=0;k<arr[i].length;k++){
        System.out.print(arr[i][k]+"\t");
      }
      System.out.println();
    }
    
  }
}