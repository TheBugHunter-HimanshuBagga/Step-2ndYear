import java.util.Scanner;

public class q1 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

        double weight,height;
        double bmi;
        System.out.println("Enter the Weight(kg) and Height(cm): ");
        weight = sc.nextDouble();
        height = sc.nextDouble(); 

        bmi = weight / ((height/100) * (height / 100));
        System.out.println("BMI: " + bmi);


    sc.close();
    }
}
