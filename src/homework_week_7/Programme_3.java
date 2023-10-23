package homework_week_7;

import java.util.Scanner;

public class Programme_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input student information
        System.out.print("Enter student's name: ");
        String name = scanner.nextLine();
        System.out.print("Enter roll number: ");
        int rollNo = scanner.nextInt();

        // Input marks for Math, Science, and English
        System.out.print("Enter Math marks (0-100): ");
        int mathMarks = scanner.nextInt();
        System.out.print("Enter Science marks (0-100): ");
        int scienceMarks = scanner.nextInt();
        System.out.print("Enter English marks (0-100): ");
        int englishMarks = scanner.nextInt();

        // Check if marks are within the valid range
        if (mathMarks < 0 || mathMarks > 100 || scienceMarks < 0 || scienceMarks > 100 || englishMarks < 0 || englishMarks > 100) {
            System.out.println("Invalid Input, Marks should be between 0 and 100");
        } else {
            // Calculate total and percentage
            int totalMarks = mathMarks + scienceMarks + englishMarks;
            double percentage = (totalMarks / 300.0) * 100;

            // Determine result and grade
            String result = (percentage >= 35) ? "Pass" : "Fail";
            String grade;
            if (percentage >= 80) {
                grade = "A+";
            } else if (percentage >= 60) {
                grade = "A";
            } else if (percentage >= 50) {
                grade = "B";
            } else {
                grade = "C";
            }

            // Print the mark sheet
            System.out.println("_______________________________                                                         ||");
            System.out.println("||");
            System.out.println("| Mark Sheet |");
            System.out.println("|_______________________________|");
            System.out.println("| Name : " + name + "|");
            System.out.println("| Roll No: " + rollNo + "|");
            System.out.println("|_______________________________|");
            System.out.println("| Subjects : Marks |");
            System.out.println("|_______________________________|");
            System.out.println("| Math : " + mathMarks + " |");
            System.out.println("| Science : " + scienceMarks + " |");
            System.out.println("| English : " + englishMarks + " |");
            System.out.println("|_______________________________|");
            System.out.println("| Total : " + totalMarks + "|");
            System.out.println("|_______________________________|");
            System.out.println("| Percentage : " + percentage + " |");
            System.out.println("| Result : " + result + " |");
            System.out.println("| Grade : " + grade + "   |");
            System.out.println("|_______________________________|");
        }


    }








































}
