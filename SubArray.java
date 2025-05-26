public class SubArray {
    public static void main(String[] args) {
        int arr[] = { 15, 2, 4, 8, 9, 5, 10, 23}, sum = 23;
        int len = arr.length;
        int numElement = 1;
        int whileLen=len;
        while (whileLen>=0){
            for(int i=0;i<len-numElement;i++){
                int sum2=0;
                for(int j=i;j<=i+numElement;j++){
                    sum2+=arr[j];
                }
                if(sum2==sum){
                    System.out.println("subarray found"+i+" "+(numElement+1));
                    break;
                }else {
                    if(numElement==0){
                        System.out.println("subarray not found");
                    }
                    if (numElement == len - 1) {
                        numElement = 0;
                    }
                }

            }
            numElement++;
            whileLen--;
        }
    }
}
