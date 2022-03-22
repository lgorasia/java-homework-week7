package HomeWorkWeek7;

import java.util.Scanner;

public class Program16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("Plese enter the number:");
        number = scanner.nextInt();

        if(number < 0){
            System.out.println("This number is NEGATIVE");
        }
        else if (number > 0){
            System.out.println("This number is POSITVE");


        }

        else
        System.out.println("This Number is ZERO");



    }
}
