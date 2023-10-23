package homework_week_7;
/**
 * 17. Write a Java program to sort a numeric array and a string array.
 */

import java.util.Arrays;

public class Programme_17 {

    public static void main(String[] args) {
        sort();
    }

    public static void sort() {
        int[] number = {10, 0, 7, 2, 4, 3, 8,};
        String[] s = {"a", "e", "d", "b", "c", "f"};

        System.out.println("Original value: " + Arrays.toString(number));
        Arrays.sort(number);
        System.out.println("Sorted value: " + Arrays.toString(number));

        System.out.println();

        System.out.println("Original characters: " + Arrays.toString(s));
        Arrays.sort(s);
        System.out.println("Sorted value: " + Arrays.toString(s));

    }
}