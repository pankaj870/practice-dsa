package CollectionFrameWork;

class Person{
    String name;
    int age;
    public String getName() {
        return name;
    }
    public int getAge(){
        return age;
    }
    public void setName(String name,int age) {
        this.name = name;
        this.age = age;
    }
}


public class Encasulation {
    public static void main(String[] args) {
        Person p = new Person();
        p.age=20;
        p.name="John";
        System.out.println(p.getName());
        System.out.println(p.getAge());
    }
}
