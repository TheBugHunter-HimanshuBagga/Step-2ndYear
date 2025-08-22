// Create a Student class that demonstrates proper class structure and object instantiation.
import java.util.Scanner;
public class oops2 { // Q2
    
    static class Student{
        private String StdID;
        private String Name;
        private double grade;
        private String Course;

        Student(){
            // Default Cponstructors
        }
        Student(String StdID , String Name , double grade , String Course){
            this.StdID = StdID;
            this.Name = Name;
            this.grade = grade;
            this.Course = Course;
        }
        public void setStdID(String StdID){
            this.StdID = StdID;
        }
        public void setName(String Name){
            this.Name = Name;
        }
        public void setgrade(double grade){
            this.grade = grade;
        }
        public void setCourse(String Course){
            this.Course = Course;
        }
        public String getStdID(){
            return StdID;
        }
        public String getName(){
            return Name;
        }
        public double getgrade(){
            return grade;
        }
        public String getCourse(){
            return Course;
        }
        public void calculateLetterGrade(){
            if(grade >= 90 && grade <= 100){
                System.out.println("Letter Grade: A");
            }
            else if(grade >= 80 && grade <= 89){
                System.out.println("Letter Grade: B");
            }
            else if(grade >= 70 && grade <= 79){
                System.out.println("Letter Grade: C");
            }
            else if(grade >= 60 && grade <= 69){
                System.out.println("Letter Grade: D");
            }
            else{
                System.out.println("Letter Grade: F");
            }
        }
         public void displayStudent() {
            System.out.println("Student ID: " + StdID);
            System.out.println("Name: " + Name);
            System.out.println("Grade: " + grade);
            System.out.println("Course: " + Course);
            calculateLetterGrade();
        }
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        Student S1 = new Student("ra445", "Himanshu Bagga", 95.0, "CSE CORE");
        S1.displayStudent();
        System.out.println();
        Student S2 = new Student("ra442", "Sreesahan" , 100 , "CSE CORE");
        S1.displayStudent();
        sc.close();
    } 
}