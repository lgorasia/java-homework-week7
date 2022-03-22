package HomeWorkWeek7;

import java.util.Scanner;

public class Program1 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter number to test");
        int number = sc.nextInt();

        // ternary operator to check number

        String result = number%2 == 0 ? "Even" : "Odd";
        System.out.println(number + " is " + result);
    }
}
