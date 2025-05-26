public class RotateRigthElement {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int d=3,t=0;
        for(int i=0;i<arr.length/d+1;i++){
            for(int j=i+d;j<arr.length;j++){
                int tem=arr[i];
                arr[i]=arr[j];
                arr[j]=tem;
            }
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
