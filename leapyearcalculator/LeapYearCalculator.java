package com.leapyearcalculator;

public class LeapYearCalculator {

    public static void main(String[] args) {

        isLeapYear(-1600);
        isLeapYear(1600);
        isLeapYear(2017);
        isLeapYear(2000);
        isLeapYear(10000);
        isLeapYear(1800);

        footerMessage();
    }

    /**
     * Instructions
     * Parameter year needs to be greater than or equal to 1
     * and less than or equal to 9999
     * if the parameter is not in that range, return false
     *
     * Otherwise, if it is in the valid range, calculate if the year is a leap year,
     * and return true if it is a leap year, otherwise return false
     *
     * The following years are not leap years
     * 1700, 1800, 1900, 2100, 2200, 2300, 2500, 2600
     *
     * The following are leap years
     * 1600, 2000, 2400
     * This is because they are evenly divisible by 100 and 400
     *
     * isLeapYear is a static method
     * Strategy: check if the year is in the range the app needs to be
     * then check if the year is divisible by 4 and if it is not than return false
     * if it is check for next condition and if the year is divisible by 100 check another condition
     * but if it is not divisible by 100 return true. Check if it is divisible by 400 and if it is
     * then return true else if it is not return false
     *
     * @param year
     * @return
     */
    public static boolean isLeapYear(int year){

        boolean result = false;
        if (year < 0 || year > 9999){
            result = false;
            System.out.println(result);
        }

        if(year > 0 && year < 9999){
            if (year % 4 == 0){
                if(year % 100 == 0) {
                    if (year % 400 == 0){
                        result = true;
                        System.out.println(result);
                    }else{
                        result = false;
                        System.out.println(result);
                    }
                }
                else{
                    result = true;
                    System.out.println(result);
                }
            }
            else{
                result = false;
                System.out.println(result);
            }
        }
        return result;
    }

    /**
     * This is the footer method to show copyRight
     * by AMIR AYOUB 2019
     */
    public static void footerMessage(){

        //print out the copy right unicode
        char copyRight =  '\u00A9';
        System.out.println("\n");
        System.out.printf("%-1s", "---------------------------");
        System.out.println();
        System.out.println("App written by: " + copyRight + " Amir 2019");
        System.out.printf("%-1s", "---------------------------");
    }
}
