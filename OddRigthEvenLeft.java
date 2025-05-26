import java.util.*;
public class OddRigthEvenLeft {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);

        int j = list.size()-1, i=0;
        while(i<j/2) {
        if(list.get(i)%2==0 && list.get(j)%2==1){
            int  tem = list.get(i);
            list.set(i, list.get(j));
            list.set(j, tem);
            j--;
            i++;
        }else if(list.get(i)%2==0){
            j--;
        }else if(list.get(i)%2==1){
            i++;
        }else{
            j--;
            i++;
        }
        }
        System.out.println(list);
    }
}
