
/*
    1°Develop a calculator program that performs 
    basic operations (addition, subtraction, multiplication, division) 
    using separate methods for each operation. Allow the user to choose 
    the operation and input numbers.
 */


import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Choose an operation (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        // Output
        switch (operator) {
            case '+':
                System.out.println("Result: " + add(num1, num2));
                break;
            case '-':
                System.out.println("Result: " + subtract(num1, num2));
                break;
            case '*':
                System.out.println("Result: " + multiply(num1, num2));
                break;
            case '/':
                System.out.println("Result: " + divide(num1, num2));
                break;
            default:
                System.out.println("Invalid operation");
        }

        scanner.close();
    }


    // Calculator methods
    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Cannot divide by zero");
            return Double.NaN; // Not a Number
        }
    }
}