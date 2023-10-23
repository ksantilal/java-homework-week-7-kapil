package homework_week_7;

import java.util.Scanner;
/**
 * 13. Write a Java program which input any number between 1 to 7 and it print The Days name MONDAY, TUESDAY…..SUNDAY of the week accordingly by using switch.
 * NOTE: if number is out of selection Print message “Week contains 1 to 7 days”
 */
public class Programme_13 {

    public static void main(String[] args) {
        Programme_13 obj = new Programme_13();
        obj.weekDays();
    }

    public void weekDays() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num = scanner.nextInt();
        switch (num) {
            case 1:
                System.out.println("Day is Monday :");
                break;
            case 2:
                System.out.println("Day is Tuesday :");
                break;
            case 3:
                System.out.println("Day is Wednesday");
                break;
            case 4:
                System.out.println("Day is Thursday");
                break;
            case 5:
                System.out.println("Day is Friday");
                break;
            case 6:
                System.out.println("Day is Saturday");
                break;
            case 7:
                System.out.println("Day is Sunday");
                break;
            default:
                System.out.println("Invalid number there are only 7 days in a week: ");
        }
        scanner.close();
    }
}

