import java.util.Scanner;
public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the total number of subjects: ");
        int numSubjects = scanner.nextInt();

        int totalMarks = 0;
        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            int marks = scanner.nextInt();
            totalMarks += marks;
        }

        double percentage = (double) totalMarks / (numSubjects * 100) * 100;
        System.out.println("Total percentage: " + percentage + "%");

        if (percentage >= 90) {
            System.out.println("Congratulations! Your grade is A+");
        } else if (percentage >= 80) {
            System.out.println("Congratulations! Your grade is A");
        } else if (percentage >= 70) {
            System.out.println("Congratulations! Your grade is B");
        } else if (percentage >= 60) {
            System.out.println("Congratulations! Your grade is C");
        } else if (percentage >= 50) {
            System.out.println("Congratulations! Your grade is D");
        } else {
            System.out.println("Sorry, you have failed");
        }

        scanner.close();
    }

}
