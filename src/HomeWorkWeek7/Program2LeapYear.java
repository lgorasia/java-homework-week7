package HomeWorkWeek7;

import java.util.Scanner;

/* In order to perform this need to follow below steps;
if value devided by 4 but not 100 it is leap year,
if value devided by 400 it is leap eaar,
else not leap year
 */
public class Program2LeapYear {


    public static void main(String[] args) {
        int year;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an year: ");
        year = in.nextInt();

if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
    System.out.println("Specified year is leap year");
else
    System.out.println("Specified year is not a leap year");
    }

}
