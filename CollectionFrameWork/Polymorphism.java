package CollectionFrameWork;

class  MovieRate{
public void show(){
    System.out.println("each for same ");
}
}

class MovieName extends  MovieRate{
    public void newone() {
        super.show();
        System.out.println("new movie");
    }
}

class MovieName2 extends MovieRate{
    @Override
    public void show() {
        super.show();
        System.out.println("2 new movie ");
    }
}

class Polymorphism {
    public static void main(String[] args) {
        MovieName2  obj2 = new MovieName2();
        obj2.show();

        MovieName ob = new MovieName();
        ob.newone();
    }
}
