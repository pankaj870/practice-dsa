package outerShell;

import java.util.*;
public class FindFactorial {
    public static void main(String[] args) {
     int n=5;
        ArrayList<Integer> list = new ArrayList<>();
        int value = 1;
        for(int i=1;i<=n;i++){
            value*=i;
    }
        while(value!=0){
        int tem = value%10;
        value/=10;
        list.add(tem);
        }
        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i));
        }

    }
}
