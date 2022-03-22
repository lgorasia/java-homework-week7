package HomeWorkWeek7;

import java.util.Scanner;

public class Program7Commission {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double commission, salesamout, basicsalary;
        int id;
        String name;


        System.out.println("Enter sales id number:");
        id = scan.nextInt();

        System.out.println("Enter sellers name:");
        name = scan.next();

        System.out.println("Enter sales amount");
        salesamout = scan.nextDouble();

        System.out.println("Enter basic salary");
        basicsalary = scan.nextDouble();

        if (salesamout >= 50000) {
            System.out.println("Commission is " + salesamout * 35 / 100);
        }
        else if (salesamout >= 30000 && salesamout < 50000) {
            System.out.println("Commission is " + salesamout * 20 / 100);
        }
        else if (salesamout >= 20000 && salesamout < 30000) {
            System.out.println("Commission is " + salesamout * 10 / 100);
        }
        else if (salesamout >= 10000 && salesamout < 20000) {
            System.out.println("Commission is " + salesamout * 5 / 100);
        }
        else  {
            System.out.println("Commission is " + salesamout * 2 / 100);
        }

    }
}