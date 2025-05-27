package outerShell;

public class RigthRotate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int n = arr.length;
        int k=3;
        int R = (n-k);

        int[] el = new int[k];
        // get element from the arr those we rorate
        int j=0;
        int[] out =new int[n];
        for(int i=R;i<n;i++){
            el[j]=arr[i];
            j++;
        }

        System.arraycopy(arr, k - k, out, k, n - k);
        System.arraycopy(el, 0, out, 0, k);

        for(int ele:out){
            System.out.print(ele+" ");
        }


    }
}
