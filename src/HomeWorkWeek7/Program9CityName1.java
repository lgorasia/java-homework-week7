package HomeWorkWeek7;

import java.util.Scanner;

public class Program9CityName1 {
static char charecter = 'a';
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);



        System.out.println( "Please enter first letter of city name between a to f:");
        charecter = scan.next().charAt(0);

        switch (charecter){
            case 'a' :
                System.out.println("City name is Ahmedabad");
                break;
            case 'A':
                System.out.println("City name is Ahmedabad");
                break;
            case 'b':
                System.out.println("City name is Baroda");
                break;
            case 'B':
                System.out.println("City name is Baroda");
                break;
            case 'c':
                System.out.println("City name is Chennai");
                break;
            case 'C':
                System.out.println("City name is chennai");
                break;
            case 'd':
                System.out.println("City name is Dahod");
                break;
            case 'D':
                System.out.println("City name is Dahod");
                break;
            case 'e':
                System.out.println("City name is Etawa");
                break;
            case 'E':
                System.out.println("City name is Etawa");
                break;
            case 'f':
                System.out.println("City name is Faridabad");
                break;
            case 'F':
                System.out.println("City name is Faridabad");
                break;
            default:
                System.out.println("Please entert valid charecter");
        }

    }
}
