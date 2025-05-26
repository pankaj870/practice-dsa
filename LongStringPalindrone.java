import java.util.List;

public class LongStringPalindrone {
    public static void main(String[] args) {
      String s = "ababc";
        for(int i=0;i< s.length();i++){
          for(int j=i+1;j<s.length();j++){
              String sub = s.substring(i,j);
               String revese = "";
              for(int k=sub.length()-1;k>=0;k--){
                  revese+=sub.charAt(k);
              }
              if(sub.length()>1 && sub.equals(revese)){
                  System.out.println(sub);
              }
          }
      }
    }
}
