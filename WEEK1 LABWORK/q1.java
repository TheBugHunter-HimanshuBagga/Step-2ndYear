import java.util.Scanner;


public class q1{


    public static int findLength(String str){


        int count = 0;
        try{
            while(true){
                str.charAt(count);
                count++;
            }
        }catch(IndexOutOfBoundsException e){
            System.out.println("Index not found!" + e);
        }
        return count;
    }
    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);


        System.out.println("Enter a string: ");
        String input = sc.nextLine();


        int Length = findLength(input);
        int buildinLength = input.length();


        System.out.println("Length found using custom method: " + Length);
        System.out.println("Length found using built-in method: " + buildinLength);


        sc.close();
    }
}
