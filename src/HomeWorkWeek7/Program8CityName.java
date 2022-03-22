package HomeWorkWeek7;

import java.util.Scanner;

public class Program8CityName {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char ch;

        System.out.println( "Please enter first letter of city name between a to f:");
        ch = scan.next().charAt(0);



        if ((ch == 'a') || ( ch == 'A')) {
            System.out.println("Name of the city is Ahmedabad");
        }

        else if ((ch == 'b') || ( ch == 'B')){
            System.out.println("Name of the city is Baroda");
        }
        else if ((ch == 'c') || ( ch == 'C')) {
            System.out.println("Name of the city is Chennai");
        }
        else if ((ch == 'd') || ( ch == 'D')){
            System.out.println("Name of the city is Dahod");
        }
        else if ((ch == 'e') || ( ch == 'E')){
            System.out.println("Name of the city is Etawah");
        }
        else if ((ch == 'f') || ( ch == 'F')){
            System.out.println("Name of the city is Faridabad");
        }
        else {
            System.out.println("Enter valid charecter");
        }

    }

}
