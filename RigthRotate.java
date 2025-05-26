public class RigthRotate {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int n = arr.length;
        int k=3;
        int R = (n-k);

        int el[] = new int[k];
        // get element from the arr those we rorate
        int j=0;
        int out[]=new int[n];
        for(int i=R;i<n;i++){
            el[j]=arr[i];
            j++;
        }

        for(int i=k;i<n;i++) {
            out[i] = arr[i - k];
        }
        for(int i=0;i<k;i++){
            out[i]=el[i];
        }

        for(int ele:out){
            System.out.print(ele+" ");
        }


    }
}
