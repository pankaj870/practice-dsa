package CollectionFrameWork;

interface  Car{
void model();
void name();
}

class ShowDetails implements  Car{
    @Override
    public void model(){
        System.out.println("this 2015");
    }

    @Override
    public void name() {
        System.out.println("volvo");
    }
}

public class Interface {
    public static void main(String[] args) {
ShowDetails obj = new ShowDetails();
obj.model();
obj.name();
    }
}
