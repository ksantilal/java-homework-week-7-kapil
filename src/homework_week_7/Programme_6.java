package homework_week_7;

import java.util.Scanner;
/**
 * 6. Write a java program to input any number and find out if it’s odd or even
 */
public class Programme_6 {

    public static void main(String[] args) { // main method
        Programme_6 obj = new Programme_6(); // created object to call the instance ,method
        obj.evenOddNumber();
    }

    public void evenOddNumber() { // instance method
        Scanner sca = new Scanner(System.in);
        System.out.println("Enter any number to find out its even or odd: ");
        int num = sca.nextInt();

        if (num % 2 == 0) {
            System.out.println("The number entered is Even");
        } else {
            System.out.println("The number entered is Odd");
        }

        sca.close();
    }
}


