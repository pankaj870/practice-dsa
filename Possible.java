import  java.util.ArrayList;
public class Possible {
    public static void main(String[] args) {
        String s = "abc";
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                String temp = "";
                if (s.charAt(i) == s.charAt(j)) {
                    char c= s.charAt(j);
                    list.add(String.valueOf(c));
                } else {
                    temp = s.charAt(i) + "" + s.charAt(j);
                    list.add(temp);
                }
            }
        }
        list.add(s);

        for (String el : list) {
            System.out.println(el);
        }
    }
}
