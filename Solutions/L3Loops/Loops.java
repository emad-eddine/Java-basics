
/*
    Write a Java program that takes a number as input from the user and generates its multiplication table using different types of loops. 
    Implement versions using for, while, and do-while loops.
 */


import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Multiplication table using for loop
        System.out.println("\nMultiplication Table (for loop):");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }

        // Multiplication table using while loop
        System.out.println("\nMultiplication Table (while loop):");
        int i = 1;
        while (i <= 10) {
            System.out.println(number + " * " + i + " = " + (number * i));
            i++;
        }

        // Multiplication table using do-while loop
        System.out.println("\nMultiplication Table (do-while loop):");
        i = 1;
        do {
            System.out.println(number + " * " + i + " = " + (number * i));
            i++;
        } while (i <= 10);

        scanner.close();
    }
}