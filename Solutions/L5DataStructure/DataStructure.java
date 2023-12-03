
/*
    1°Create a program that initializes an array of integers. 
    2°Implement functions to find the sum, average, maximum, and minimum values in the array. 
    3°Additionally, allow the user to input new values into the array.
 */


import java.util.Scanner;

public class DataStructure {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Array initialization
        int[] numbers = { 5, 8, 2, 10, 3 };

        // Output
        System.out.println("Array: " + java.util.Arrays.toString(numbers));
        System.out.println("Sum: " + calculateSum(numbers));
        System.out.println("Average: " + calculateAverage(numbers));
        System.out.println("Maximum: " + findMaximum(numbers));
        System.out.println("Minimum: " + findMinimum(numbers));

        // Input new values into the array
        System.out.print("Enter new values (comma-separated): ");
        String input = scanner.nextLine();
        String[] inputValues = input.split(",");
        int[] newNumbers = new int[inputValues.length];

        for (int i = 0; i < inputValues.length; i++) {
            newNumbers[i] = Integer.parseInt(inputValues[i].trim());
        }

        System.out.println("New Array: " + java.util.Arrays.toString(newNumbers));

        scanner.close();
    }

    // Array manipulation methods
    public static int calculateSum(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    public static double calculateAverage(int[] array) {
        return (double) calculateSum(array) / array.length;
    }

    public static int findMaximum(int[] array) {
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static int findMinimum(int[] array) {
        int min = array[0];
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
}