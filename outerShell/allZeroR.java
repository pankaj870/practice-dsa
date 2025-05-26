package outerShell;

public class allZeroR {
    public static void main(String[] args) {
        int arr[] = {1, 2, 0, 4, 3,0,-1
                , 0, 5, 0};
        int current = 0;

        for (int i = 1; i < arr.length; i++) {
            current = arr[i];
            if (current == 0) {
                int j=i+1;
                while(j<arr.length){
                    if (arr[j] != 0) {
                        int temp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = temp;

                        break;
                    }
                    j++;
                }
            }
        }
        for(int e : arr){
            System.out.print(e + " ");
        }
    }
}