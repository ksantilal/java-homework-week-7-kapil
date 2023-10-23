package homework_week_7;

/**
 * Write a Java program to sum values of an array.
 */
public class Programme_18 {

    public static void main(String[] args) {
        Programme_18 obj = new Programme_18();
        obj.arraySum();
    }

    public void arraySum() {

        int[] a = {1, 2, 3, 4, 5}; // initialize array
        int sum = 0;

        for (int j : a) {// used loop to calculate the array
            sum = sum + j;
        }
        System.out.println("Sum of all the elements of an array is :" + sum);
    }
}