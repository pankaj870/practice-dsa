package CollectionFrameWork;

public class PeraConstructor {
String name = "";
int age = 0;

   PeraConstructor(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println(
                name + " " + age + " "
        );
    }

    public static void main(String[] args) {
PeraConstructor pera = new PeraConstructor("gokul", 18);
    }
}
