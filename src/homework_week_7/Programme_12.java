package homework_week_7;

import java.util.Scanner;

/**
 * 12.write a java program that tells us input value is number or an alphabet or symbol
 */
public class Programme_12 {

    public static void main(String[] args) {
        Programme_12 obj = new Programme_12();
        obj.inputValue();
    }

    public void inputValue() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any character/value: ");
        char a = scanner.next().charAt(0);

        // using character class
        if (Character.isAlphabetic(a)) {
            System.out.println(a + " is a Alphabet ");
        } else if (Character.isDigit(a)) {
            System.out.println(a + " is a Digit ");
        } else {
            System.out.println(a + " is a Special character");
        }

        scanner.close();
    }
}
