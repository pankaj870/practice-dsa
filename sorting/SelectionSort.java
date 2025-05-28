package sorting;

import com.sun.security.jgss.GSSUtil;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {1,5,2,4,6,5,8,7,9,21,2,3,1,0,6,8,5,4,3,5,15};

        for(int i=0;i<array.length;i++){
            int  min=i;
            for(int j=i+1;j<array.length;j++) {
                if (array[min] > array[j]) {
                    min = j;
                }
            }
           int temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }
        for(int ele : array){
            System.out.print(ele+" ");
        }
    }
}
