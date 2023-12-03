
/*
   1°Create a program that takes a student's score as input and uses if-else statements to determine their grade(Excellent....etc). 
   2°Additionally, implement a version of the program using a switch statement.
 */


import java.util.Scanner;

public class ConditionStatements {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter student's score: ");
        int score = scanner.nextInt();

        // Grade calculation using if-else
        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else if (score >= 70) {
            System.out.println("Grade: C");
        } else if (score >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }

        // Grade calculation using switch
        int grade = score / 10;
        switch (grade) {
            case 9:
            case 10:
                System.out.println("Grade: A");
                break;
            case 8:
                System.out.println("Grade: B");
                break;
            case 7:
                System.out.println("Grade: C");
                break;
            case 6:
                System.out.println("Grade: D");
                break;
            default:
                System.out.println("Grade: F");
        }

        scanner.close();
    }
}