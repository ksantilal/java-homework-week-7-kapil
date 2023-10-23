package homework_week_7;


import java.util.Scanner;

/**
 * 2. write a java program to input any year like (ex. 2007) and find out if it is leap year or not?
 */
public class
Programme_2 {

    public static void main(String[] args) {//main method
        //calling the method directly into the main method as  it's a static method
        leapYear();
    }

    public static void leapYear() {
        Scanner sca = new Scanner(System.in);// user scanner to take the input from the user

        System.out.println("Input the year : ");//asking input from user
        int year = sca.nextInt();//assigning the input

        boolean a = (year % 4) == 0;
        boolean b = (year % 100) != 0;
        boolean c = ((year % 100 == 0) && (year % 400 == 0));

        if (a && (b || c)) {
            System.out.println(year + " is a leap year ");
        } else {
            System.out.println(year + " is not leap year");
        }

        sca.close();
    }
}
