package homework_week_7;

/**
 * 11.write a java program to print the number between 1 to 100  which can be divided by 3 and 5 separately.
 */
public class Programme_11 {

    public static void main(String[] args) {
        divided();
    }

    public static void divided() {

        System.out.println("\nnumber divided by 3:");
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0) {
                System.out.print(i + ", ");
            }
        }
        System.out.println("\n\nNumbers divided by 5:");
        for (int i = 1; i < 100; i++) {
            if (i % 5 == 0) {
                System.out.print(i + ", ");
            }
        }
        System.out.println("\n\nNumbers divided by 3 & 5:");
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(i + ", ");
            }

        }
        System.out.println("");
    }
}