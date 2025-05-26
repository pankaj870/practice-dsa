public class MatrixElementFind {
    public static void main(String[] args) {
        int mat[][] = {{19, 22, 27, 38, 55, 67}}, x = 9;
        int n = mat.length;
        boolean flag=false;
        int i=0;
        System.out.print(n+""+mat[i][0]);
        while(i<n){
            for(int j=0;j<mat[i].length;j++){
               if(mat[i][j]==x){
                   flag=true;
               }
            }
            if(flag){
                break;
            }
            i++;
        }
        System.out.println(flag);
    }
}
