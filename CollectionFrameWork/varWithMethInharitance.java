package CollectionFrameWork;

import java.util.ArrayList;

class course{
     String[] course_name = {"C" , "java" ,"python" , "MySql"};
     int[] course_price = {1000,3000,2000,5000};
}

 class showCourse extends course{
    public void YourCourse(int index){
        System.out.println("this is your course ");
        System.out.println(course_name[index]+" "+course_price[index]);
    }
 }

public class varWithMethInharitance {
    public static void main(String[] args) {
        showCourse obj = new showCourse();
        obj.YourCourse(1);
    }
}
