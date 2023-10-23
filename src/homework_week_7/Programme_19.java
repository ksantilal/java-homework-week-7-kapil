package homework_week_7;
/**
 * 19. Write a Java program to calculate the average value of array elements.
 */
public class Programme_19 {

        public static void main(String[] args) {
            arrayAvg();
        }
        public static void arrayAvg() {
            int[] a ={5,8,13,18,11}; //.create an array
            int l; // getting array length
            l = a.length;
            int sum=0; // default sum value
            // sum of all elements in array using for loop
            for (int j : a) {
                sum += j;
            }
            double avg = sum/l;
            System.out.println("Average of array is: " +avg);
        }
    }

