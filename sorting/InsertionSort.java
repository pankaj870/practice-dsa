package sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = new int[]{5, 4,7, 3,0,8, 2, 1};

        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
              if(array[j]<array[j-1]){
                  int temp = array[j];
                  array[j] = array[j-1];
                  array[j-1] = temp;
              }
            }
        }

        for(int ele : array){
            System.out.print(ele+" ");
        }
    }
}
