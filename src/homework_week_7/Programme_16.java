package homework_week_7;

import java.util.Scanner;

/**
 * 16.write the java program to check if enter number is "POSITIVE", "NAGATIVE" or "ZERO"
 */
public class Programme_16 {

    public static void main(String[] args) {
        Programme_16 obj = new Programme_16();
        obj.positiveNegative();
    }

    public void positiveNegative() {// main method
        Scanner scanner = new Scanner(System.in);// object of scanner class
        System.out.println("Enter a Number: ");
        int num = scanner.nextInt();//reading a number from user
        if (num > 0) { // checking if the number is greater than or not
            System.out.println("The number entered is Positive: ");
        } else if (num < 0) { //checking if the number is less than or not
            System.out.println("The number entered is Negative: ");
        } else { // executes when the above two conditions are false
            System.out.println("The number entered is Zero");
        }
        scanner.close();
    }
}
