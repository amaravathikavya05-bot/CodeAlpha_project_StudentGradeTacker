import java.util.ArrayList;
import java.util.Scanner;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class StudentGradeTracker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        System.out.println("==============================");
        System.out.println("   STUDENT GRADE TRACKER");
        System.out.println("==============================");

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        // Input student details
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Student " + (i + 1));

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Marks: ");
            int marks = sc.nextInt();
            sc.nextLine();

            students.add(new Student(name, marks));
        }

        // Variables for calculations
        int total = 0;
        int highest = students.get(0).marks;
        int lowest = students.get(0).marks;

        String topStudent = students.get(0).name;
        String lowStudent = students.get(0).name;

        // Calculate average, highest, lowest
        for (Student s : students) {
            total += s.marks;

            if (s.marks > highest) {
                highest = s.marks;
                topStudent = s.name;
            }

            if (s.marks < lowest) {
                lowest = s.marks;
                lowStudent = s.name;
            }
        }

        double average = (double) total / n;

        // Display Report
        System.out.println("\n==============================");
        System.out.println("      STUDENT REPORT");
        System.out.println("==============================");

        for (Student s : students) {
            System.out.println("Name: " + s.name + " | Marks: " + s.marks);
        }

        System.out.println("\nAverage Marks: " + average);
        System.out.println("Highest Marks: " + highest + " (" + topStudent + ")");
        System.out.println("Lowest Marks: " + lowest + " (" + lowStudent + ")");

        sc.close();
    }
}
