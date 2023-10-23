package homework_week_7;


import java.util.Scanner;

/**
 * 1.write a java program that tells us Input number is odd or even?
 * HINT : use ternary operator (? : )
 */
public class Programme_1 {
    public static void main(String[] args) {

        Programme_1 obj = new Programme_1();
        obj.evenOdd();
    }

    public void evenOdd() {
        Scanner sca = new Scanner(System.in);//used scanner to take input from the user

        System.out.println("Enter a number :");//enter the number
        int num = sca.nextInt();//assigning the user input to number variable

        //used ternary operator to check entered number is even or odd
        String result = num % 2 == 0 ? "Even" : "Odd";
        System.out.println(num + " is " + result);//print the result
        sca.close();// closiing the scanner
    }

}

