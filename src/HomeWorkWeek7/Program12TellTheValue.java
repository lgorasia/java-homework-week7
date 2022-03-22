package HomeWorkWeek7;

import java.util.Scanner;

public class Program12TellTheValue {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any value:");
        char ch = scanner.next(). charAt(0);
        if ((ch>= 'a' && ch<= 'z') || (ch>= 'A' && ch <= 'Z')){
            System.out.println(ch + " is alphabet.");
        }
        else if (ch>='0' && ch <= '9'){
            System.out.println(ch + " is a digit.");
    }
        else {
            System.out.println(ch + " is a special character.");
        }
}
}