package outerShell;

public class RotateRightMatrix {
    public static void main(String[] args) {
        int mat[][]={{1, 2, 3,},
                {4, 5 ,6},
                {7 ,8, 9}};
        int n = mat.length;
        int mat2[][]=new int[n][n];
        for(int i=0;i<mat2.length;i++){
            int t=n-1;
            for(int j=0;j<mat[i].length;j++){
                mat2[t-j][i] = mat[i][j];
            }
        }

        for(int i=0;i<mat.length;i++){
          for(int j=0;j<mat[i].length;j++){
                System.out.print(mat2[i][j]+" ");
            }
          System.out.println();
        }
    }
}
