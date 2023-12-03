
/*
    1°Write a Java program that prompts the user to enter their name, age, and favorite color.
    2°Store this information in variables and then display a message using these variables. 
    3°Also, manipulate the user's name by converting it to uppercase and lowercase.
 */


import java.util.Scanner;

public class FirstStep {
    public static void main(String[] args) {

        String userName,userFavColor;
        byte userAge;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name");
        userName = scanner.nextLine();


        System.out.println("Enter your age");
        userAge = scanner.nextByte();

        System.out.println("Enter your favorite Color");
        userFavColor = scanner.next();

        // String manipulation
        String upperCaseName = userName.toUpperCase();
        String lowerCaseName = userName.toLowerCase();

        // print the result
        // Output
        System.out.println("\nUser Information:");
        System.out.println("Your Name: " + userName);
        System.out.println("Your Age: " + userAge);
        System.out.println("Your Favorite Color: " + userFavColor);
        System.out.println("Name in Uppercase: " + upperCaseName);
        System.out.println("Name in Lowercase: " + lowerCaseName);

        scanner.close();

    }
}