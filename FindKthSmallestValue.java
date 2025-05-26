public class FindKthSmallestValue {
    public static void main(String[] args) {
        int arr[] = {7,8,10,2, 4,3, 20, 15}, K = 4;
        int value=0;
x:        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for(int j = 0; j < arr.length-1; j++) {
                if(arr[i]>arr[j]){
                    count++;
                }
            } if(count==K) {
        value=arr[i];
        break x;
    }
        }
        System.out.println(value);
    }
}
