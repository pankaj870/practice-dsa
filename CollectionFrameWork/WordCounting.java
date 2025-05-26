package CollectionFrameWork;
import java.util.*;
import java.util.ArrayList;

public class WordCounting {
    public static void main(String[] args) {
    String str = "java is a very good java is nice ";
    String[] words = str.split(" ");
    Set<String> unique = new HashSet<>();
    for(String ele : words){
        unique.add(ele);
    }

        System.out.println(unique);
    for(String uq : unique){
       int count=0;
        for(String ele : words){
            if(uq.equals(ele)) {
                count++;
            }
        }
        System.out.println(uq+"-"+count);
    }
    }
}
