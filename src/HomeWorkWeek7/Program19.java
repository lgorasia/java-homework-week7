package HomeWorkWeek7;

public class Program19 {
    public static void main(String[] args) {
        int[] numbers = {10,20,30,40,50};
        int sum = 0;

        for(int number: numbers){
            sum += number;

        }
        int average = sum/numbers.length;
        System.out.println("Average of arrry elements is " + average);
    }

}

