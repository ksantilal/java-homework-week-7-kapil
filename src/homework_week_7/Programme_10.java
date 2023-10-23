package homework_week_7;

import java.util.Scanner;

/**
 * Write a java program to input any two number and ask user to enter their symbol (+, -, /, *) find addition,
 * Subtraction, multiplication and division according to their symbol (using if else)
 */
public class Programme_10 {

    public static void main(String[] args) {
        Programme_10 obj = new Programme_10();
        obj.mathOperators();
    }

    public void mathOperators() {
        Scanner sca = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        int a = Integer.parseInt(sca.nextLine());
        System.out.println("Please enter second number: ");
        int b = Integer.parseInt(sca.nextLine());
        System.out.println("Enter the type of operator you want to perform; ");
        char s = sca.next().charAt(0);

        if (s == '+') {
            System.out.println("Addition of two numbers is: " + (a + b));
        } else if (s == '-') {
            System.out.println("Subtraction of two numbers is: " + (a - b));
        } else if (s == '*') {
            System.out.println("Multiplication of two numbers is: " + (a * b));
        } else if (s == '/') {
            System.out.println("Division of two numbers is: " + (a / b));
        } else {
            System.out.println("Invalid input");
        }

        sca.close();
    }
}

