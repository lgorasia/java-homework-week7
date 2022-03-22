package HomeWorkWeek7;

public class Program4 {
    public static boolean isLeapYear(int year) {

        boolean isleap;

        if (year < 1 || year > 9999) {
            isleap = false;
            System.out.println(year + " Parameter not in range (1-9999)");
        } else if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            isleap = true;
            System.out.println("Year " + year + " is a leap year");
        } else {
            isleap = false;
            System.out.println("year " + year + " is not a leap year");
        }
        return isleap;
    }

    public static int getDaysInMonth(int month, int year){

        if ((month<1)||(month>12) || (year<1) || (year>9999)){
            System.out.println("Invalid Month");
            System.out.println("Invalid Year");
            return -1;
        }
        switch (month){

            case 1:
                System.out.println("31");
                break;
            case 2:
                if ((month==2)&& isLeapYear(year)){
                    System.out.println("29");
                }else
                    System.out.println("28");
                break;
            case 3:
                System.out.println("31");
                break;
            case 4:
                System.out.println("30");
                break;
            case 5:
                System.out.println("31");
                break;
            case 6:
                System.out.println("30");
                break;
            case 7:
                System.out.println("31");
                break;
            case 8:
                System.out.println("31");
                break;
            case 9:
                System.out.println("30");
                break;
            case 10:
                System.out.println("31");
                break;
            case 11:
                System.out.println("30");
                break;
            case 12:
                System.out.println("31");
                break;
        }
        //System.out.println("");
        return 0;
    }

    public static void main(String[] args) {

        isLeapYear(-1600);
        isLeapYear(1600);
        isLeapYear(2017);
        isLeapYear(2000);

        System.out.println("");

        // System.out.println("Month"+ + getDaysInMonth(3,2020));
        getDaysInMonth(1,2020);
        getDaysInMonth(2,2020);
        getDaysInMonth(2,2018);
        getDaysInMonth(-1,2020);
        getDaysInMonth(1,-2020);


    }
}

