package CollectionFrameWork;

public class CountWords {
    public static void main(String[] args) {
        String  str = "this is new words cans ";
        int count =str.split("\\s").length;
        System.out.println(count);
    }
}
