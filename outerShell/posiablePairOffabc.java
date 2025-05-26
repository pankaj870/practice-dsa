package outerShell;

import java.util.ArrayList;

public class posiablePairOffabc {
    public static void main(String[] args) {
        String str = "abcdefghijklmnopqrstuvwxyz";
        ArrayList<String> list = new ArrayList<>();
        String out = "";
        for(int i=0;i<str.length();i++){
            out += str.charAt(i);
            if(str.length()-1==i){
                list.add(out);
            }
            if(out.length()==4){
                list.add(out);
                out = "";
            }
        }
        System.out.println(list);
    }
}
