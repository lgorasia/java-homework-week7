package HomeWorkWeek7;

import java.util.Scanner;

public class Program5 {

    public static void main(String[] args) {
        int id;
        double b;
        String name;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Employee ID:");
        id = scan.nextInt();

        System.out.println("Enter Employee Name:");
        name = scan.next();

        System.out.println("Enter basic salary");
        b = scan.nextDouble();
double c = b * 10/100;
double d = b * 8/100;
double e = b * 9/100;
double f = b * 20/100;
double g = b+c+d+e-f;






        System.out.println("_________________________________________");
        System.out.println("|               Salary Slip              |");
        System.out.println("|________________________________________|");
        System.out.println("|Employee Id        : " + id +          "|");
        System.out.println("|Employee Name      : " + name +        "|");
        System.out.println("|________________________________________|");
        System.out.println("|Basic Salary       : " + b +           "|");
        System.out.println("|HRA 10%            : " + c  +          "|");
        System.out.println("|TA 8%              : " + d + "          |");
        System.out.println("|DA 9%              : " + e + "          |");
        System.out.println("|PF -20%            : " + f + "          |");
        System.out.println("|________________________________________|");
        System.out.println("|Gross Salary       : " + g + "          |");
        System.out.println("|========================================|");

    }
}
