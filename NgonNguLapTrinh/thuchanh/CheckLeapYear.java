package NgonNguLapTrinh.thuchanh;

import java.util.Scanner;

public class CheckLeapYear {
    public static void main(String[] args) {
        Scanner SC= new Scanner(System.in);
        System.out.println("enter the year:");
        int year= SC.nextInt();
        boolean isLeapYear = false;
        if (year%4==0){
            if (year%100==0) {
                if (year % 400 == 0) {
                    isLeapYear = true;
                }
            }
                else {
                    isLeapYear=true;

            }
        }
        if(isLeapYear){
            System.out.printf("%d is a leap year", year);
        } else {
            System.out.printf("%d is NOT a leap year", year);
        }
    }
}
