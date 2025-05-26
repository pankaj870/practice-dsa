package CollectionFrameWork;

public class FrequancyCount {
    public static void main(String[] args) {
        String str = "successfully";
        int max = 0;
        char max_char = 'a';

        for(int i=0;i<str.length();i++){
            int count =0 ;
            for(int j=0;j<str.length();j++){
                if(str.charAt(i) == str.charAt(j)){
                    count++;
                }
            }
            if(max<count){
                max_char = str.charAt(i);
                max = count;
            }
        }
        System.out.println(max + " " + max_char);
    }
}
