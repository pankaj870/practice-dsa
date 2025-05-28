package sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {4,2,1,6,5,4,9,3,21,14,23,45,78,41,11,22,23,55,99,45,14,20,10,1};

      for(int i=0;i<arr.length-1;i++){
          for(int j=0;j<arr.length-1;j++){
              if(arr[j]>arr[j+1]){
                  int temp = arr[j];
                  arr[j] = arr[j+1];
                  arr[j+1]=temp;
              }
          }
      }

        for (int element : arr) {
            System.out.println(element);
        }
    }
}
