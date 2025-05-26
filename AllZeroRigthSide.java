public class AllZeroRigthSide {
    public static void main(String[] args) {
        int arr[] = {1 ,2 ,0 ,4 ,3 ,0 ,5 ,0};
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[j]!=0 && arr[i]==0){
                int tem=arr[i];
                arr[i]=arr[j];
                arr[j]=tem;
                break;
                }
            }
            }

        for(int ele:arr){
            System.out.print(ele+" ");
        }

    }
}
