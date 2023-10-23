package homework_week_7;

import java.util.Scanner;

/**
 * 5. WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross salary
 * HRA = basic salary 10% DA = Basic salary 8% TA = Basic salary 9% PF= Basic salary 20% Gross salary = basic salary + HRA + TA + DA –PF Print in following format
 * _______________________________ |
 * Salary Slip |
 * |______________________________|
 * | Employee Id : 2564 |
 * | Employee Name : Jay |
 * |______________________________|
 * | Basic Salary : 25000.0 |
 * | HRA 10% : 2500.0 |
 * | TA 8% : 2250.0 |
 * | DA 9% : 2000.0 |
 * | PF - 20& : 5000.0 |
 * |______________________________|
 * | Gross Salary : 26750.0 |
 * |===========================|
 */


public class Programme_5 {
    public static void main(String[] args) {//main method

        int employeeId;
        double basicsalary, HRA, TA, DA, PF, Grosssalary;
        String name;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter employee Id: ");
        employeeId = scanner.nextInt();
        System.out.println("Employee name");
        name = scanner.next();
        System.out.println("Enter employee basic salary: ");
        basicsalary = scanner.nextInt();

        HRA = basicsalary * 10 / 100;
        TA = basicsalary * 9 / 100;
        DA = basicsalary * 8 / 100;
        PF = basicsalary * 20 / 100;
        Grosssalary = basicsalary + HRA + TA + DA + PF;

        System.out.println("Gross salary = " + Grosssalary);
    }

    //static method
    public static void print(int employeeId, String name, double basicsalary, double HRA, double TA, double DA, double PF, double grosssalary) {
        System.out.println("________________________________________________________");
        System.out.println("|                       Salary Slip                     |");
        System.out.println("|_______________________________________________________|");
        System.out.println("|   Employee Id             :" + employeeId + "|");
        System.out.println("|   Employee Name           :" + name + "|");
        System.out.println("|_______________________________________________________|");
        System.out.println("|   Basic Salary            :" + basicsalary + "|");
        System.out.println("|   HRA 10%                 :" + HRA + "|");
        System.out.println("|    TA 8%                  :" + TA + "|");
        System.out.println("|    DA 9%                  :" + DA + "|");
        System.out.println("|    PF 20%                 :" + PF + "|");
        System.out.println("|_______________________________________________________|");
        System.out.println("|    Gross Salary           :" + grosssalary + "|");
        System.out.println("|=======================================================|");
    }

}
