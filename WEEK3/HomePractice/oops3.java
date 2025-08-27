// Create a program that clearly demonstrates the difference between instance and static
// members.

// Instance -> Belongs to the object.Each object has it own copy
// Static = Belongs to the class itself . Shared among all objects

class Student{
    // Instance
    String name;
    // Static 
    static String college = "SRM KTR";

    Student(String name){
        this.name = name;
    }
    
    //Instance Method
    void display(){
         System.out.println("Name: " + name + ", College: " + college);
    }

    // static method
    static void changeCollege(String newCollege){
        college = newCollege;
    }

}
public class oops3 {
    public static void main(String[] args){

        Student s1 = new Student("Himanshu");
        Student s2 = new Student("Priyanshu");

        s1.display();
        s2.display();
        
        s2.name = "Arya";
        s2.changeCollege("IIT  Madras");

        s2.display();
    }
}
