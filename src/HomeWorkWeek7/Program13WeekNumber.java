package HomeWorkWeek7;

import java.util.Scanner;

public class Program13WeekNumber {
static int day = 4;
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        day = in.nextInt();

        switch (day){
            case 1:
                System.out.println("Today is Monday");
                break;

            case 2:
                System.out.println("Today is Tuesday");
                break;

            case 3:
                System.out.println("Today is Wednesday");
                break;

            case 4:
                System.out.println("Today is Thursday");
                break;

            case 5:
                System.out.println("Today is Friday");
                break;

            case 6:
                System.out.println("Today is Saturday");
                break;

            case 7:
                System.out.println("Today is Sunday");
                break;

            default:
                System.out.println("Looking forward to the weekend");

        }

    }

}
