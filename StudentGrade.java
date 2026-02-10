import java.util.Scanner;

class Student {
    private String name;
    private int rollNo;
    private int[] marks = new int[5];
    private double average;

    // Constructor
    public Student(String name, int rollNo, int[] marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    // Method to calculate average
    public void calculateAverage() {
        int total = 0;
        for (int i = 0; i < marks.length; i++) {
            total += marks[i];
        }
        average = total / 5.0;
    }

    // Method to display result
    public void displayGrade() {
        System.out.println("\nStudent Name: " + name);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Average Marks: " + average);

        if (average >= 75) {
            System.out.println("Grade: A");
        } else if (average >= 50) {
            System.out.println("Grade: B");
        } else {
            System.out.println("Grade: C");
        }
    }
}

public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        int rollNo = sc.nextInt();

        int[] marks = new int[5];
        System.out.println("Enter marks of 5 subjects:");
        for (int i = 0; i < 5; i++) {
            marks[i] = sc.nextInt();
        }

        Student student = new Student(name, rollNo, marks);
        student.calculateAverage();
        student.displayGrade();

        sc.close();
    }
}