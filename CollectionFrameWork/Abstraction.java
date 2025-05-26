package CollectionFrameWork;

abstract class car{
    public abstract void modelYear();
    public abstract void brand();
}

class showDetails extends car{
    @Override
    public void modelYear() {
        System.out.println("this is 2015");
    }

    @Override
    public void brand() {
        System.out.println("tata");
    }
}

public class Abstraction {
    public static void main(String[] args) {
    showDetails obj = new showDetails();
    obj.brand();
    obj.modelYear();
    }
}


