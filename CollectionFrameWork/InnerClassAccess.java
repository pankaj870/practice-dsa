package CollectionFrameWork;

class MainClass{
    public static void showMainClass(){
        System.out.println("MainClass method");
    }

    // inner class
    class InnerClass{
        public static void showInnerClass(){
            System.out.println("this is Inner class method");
        }
    }
}

public class InnerClassAccess {
    public static void main(String[] args) {
        MainClass mainC = new MainClass();
//        MainClass.InnerClass innerClass = mainC.new InnerClass();
        MainClass.InnerClass.showInnerClass();
        mainC.showMainClass();
    }
}
