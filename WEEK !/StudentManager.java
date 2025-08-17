import java.util.Scanner;

public class StudentManager {
    static String[] students = new String[10]; // Fixed-size array for demo
    static int count = 0; // Number of students added

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Student Manager ---");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Remove Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            // Fix: Handle non-integer input gracefully
            while (!sc.hasNextInt()) {
                System.out.println("Invalid input! Please enter a number.");
                sc.next(); // Consume invalid input
                System.out.print("Enter your choice: ");
            }
            choice = sc.nextInt();

            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addStudent(sc);
                    break;
                case 2:
                    displayStudents();
                    break;
                case 3:
                    searchStudent(sc);
                    break;
                case 4:
                    removeStudent(sc);
                    break;
                case 5:
                    System.out.println("Exiting... Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 5);

        sc.close();
    }

    // Method to add a student
    public static void addStudent(Scanner sc) {
        if (count >= students.length) {
            System.out.println("Student list is full!");
            return;
        }
        System.out.print("Enter student name: ");
        String name = sc.nextLine().trim();
        if (name.isEmpty()) {
            System.out.println("Student name cannot be empty!");
            return;
        }
        students[count] = name;
        count++;
        System.out.println("Student added successfully!");
    }

    // Method to display all students
    public static void displayStudents() {
        if (count == 0) {
            System.out.println("No students in the list.");
            return;
        }
        System.out.println("List of Students:");
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + students[i]);
        }
    }

    // Method to search for a student
    public static void searchStudent(Scanner sc) {
        System.out.print("Enter name to search: ");
        String name = sc.nextLine().trim();
        if (name.isEmpty()) {
            System.out.println("Student name cannot be empty!");
            return;
        }
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (students[i].equalsIgnoreCase(name)) {
                System.out.println("Student found at position " + (i + 1));
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student not found.");
        }
    }

    // Method to remove a student
    public static void removeStudent(Scanner sc) {
        System.out.print("Enter name to remove: ");
        String name = sc.nextLine().trim();
        if (name.isEmpty()) {
            System.out.println("Student name cannot be empty!");
            return;
        }
        int index = -1;
        for (int i = 0; i < count; i++) {
            if (students[i].equalsIgnoreCase(name)) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            // Shift elements to left
            for (int i = index; i < count - 1; i++) {
                students[i] = students[i + 1];
            }
            students[count - 1] = null;
            count--;
            System.out.println("Student removed successfully.");
        } else {
            System.out.println("Student not found.");
                    }
    }
}