package outerShell;

import java.util.*;
public class checkOccurance {
    public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
        int arr1[] = {11, 1, 13, 21, 3, 7}, arr2[] = {11, 3, 7, 1};
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                    if (arr1[i] == arr2[j]) {
                        count++;
                    }
            }
        }
        if(count==arr2.length){
            System.out.println("Yes"+count);
        }else {
            System.out.println("No"+count);
        }
    }
}
