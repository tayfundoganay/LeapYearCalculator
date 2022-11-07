import java.util.Scanner;

public class leapYearCalculator {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int year;
        boolean isLeapYear;
        
        System.out.print("Enter a year : ");
        year = scanner.nextInt();

        if (year%400 == 0){
        isLeapYear = true;
        }else {isLeapYear = false;
        }

        if (isLeapYear = true) {
            System.out.println(year + " bir artık yıldır ! ");
        }else {
            System.out.println(year + " bir artık yıl değildir !");
        }
    }
}
