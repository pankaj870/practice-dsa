package outerShell;

import java.util.*;
public class SubArraysFindIN {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int target = 15;
        ArrayList<Integer> list = new ArrayList<>();
        int sum =0;
        boolean flag=false;
        for(int i=0;i<arr.length-1;i++){
            sum =arr[i];
            for(int j=i+1;j<arr.length;j++){
                sum+=arr[j];
                if(target == sum){
                   list.add(i);
                   list.add(j);
                    flag = true;
                    break;
                }
            }
            if(flag){
                break;
            }
        }
        if(list.size()==0){
            System.out.println(-1);
            }else{
            System.out.print(list);}
    }
}
