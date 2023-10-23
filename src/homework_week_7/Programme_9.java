package homework_week_7;

import java.util.Scanner;

/**
 * 9.Input any alphabet from “A" to “F” and print their city name accordingly (switch statement)
 * if any other alphabet should be invalid entry
 */
public class Programme_9 {

    public static void main(String[] args) { // main method
        Programme_9 obj = new Programme_9(); // created object to call the instance method
        obj.city();
    }

    public void city() { // instance method
        Scanner sca = new Scanner(System.in);
        System.out.println("Enter any lower case alphabet from A to F to print the city Name on the alphabet entered : ");
        String alp = sca.next();
        switch (alp) {
            case "a":
                System.out.println("Ahmedabad");
                break;
            case "b":
                System.out.println("Bombay");
                break;
            case "c":
                System.out.println("Colombia");
                break;
            case "d":
                System.out.println("Delhi");
                break;
            case "e":
                System.out.println("Egypt");
                break;
            case "f":
                System.out.println("France");
                break;
            default:
                System.out.println("Invalid input");
        }
        sca.close();
    }
}

