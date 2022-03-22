package HomeWorkWeek7;

import java.util.Scanner;

public class Program6OddOrEven {

    public static void main(String[] args) {

        int number;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        number = in.nextInt();

        if (number % 2 == 0)
            System.out.println(number + " is even");
        else
            System.out.println(number + " is odd");


    }
}
