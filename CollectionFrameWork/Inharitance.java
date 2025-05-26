package CollectionFrameWork;

class Get_age {
     int age = 40;
}
class Get_name extends  Get_age{
    void display(){
        System.out.println("this is "+ this.age + "years old.");
    }
}

public class Inharitance {
    public static void main(String[] args) {
        Get_name obj = new Get_name();
        obj.display();
    }
}
