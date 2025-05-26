
class Student {
    // Private fields (data hiding)
    private String name;
    private int age;
    private String rollNumber;
    
    // Constructor
    public Student(String name, int age, String rollNumber) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
    }
    
    // Getter methods
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public String getRollNumber() {
        return rollNumber;
    }
    
    // Setter methods
    public void setName(String name) {
        this.name = name;
    }
    
    public void setAge(int age) {
        if (age > 0 && age < 100) {  // Data validation
            this.age = age;
        } else {
            System.out.println("Invalid age");
        }
    }
    
    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }
}

public class Incapsulation {
    public static void main(String[] args) {
        // Creating student object
        Student student = new Student("John Doe", 20, "A123");
        
        // Accessing data through methods
        System.out.println("Student Details:");
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Roll Number: " + student.getRollNumber());
        
        // Modifying data through methods
        student.setName("Jane Doe");
        student.setAge(21);
        
        System.out.println("\nUpdated Student Details:");
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Roll Number: " + student.getRollNumber());
    }
}
