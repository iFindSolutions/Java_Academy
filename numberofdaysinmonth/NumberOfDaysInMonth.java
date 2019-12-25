package com.numberofdaysinmonth;
public class NumberOfDaysInMonth {

    private static final boolean yesTrue = true;
    private static final boolean notTrue = false;

    public static void main(String[] args) {

        isLeapYear(-1600);
        isLeapYear(1600);
        isLeapYear(2017);
        isLeapYear(2000);
        isLeapYear(2020);

        System.out.println("\n");

        getDaysInMonth(1, 2020);
        getDaysInMonth(2, 2020);
        getDaysInMonth(2,2018);
        getDaysInMonth(-1, 2020);
        getDaysInMonth(1, -2020);

        footerMessage();
    }

    /**
     * Instructions
     *
     * The parameter needs to be greater than or equal to 1
     * and less than or equal to 9999, return false otherwise
     *
     * if the year is valid then check to see if the year is a leadYear
     * or not, true or false
     *
     * If the year can be evenly divided by 4, it is a leap year
     *
     * If the year can be evenly divided by 100, it is not a leap year <-- not a leap year
     *
     * If the year also can be divided by 400 then it is a leap year
     * @param year
     * @return
     */
    public static boolean isLeapYear(int year){

        boolean result = false;
        if (year >= 1 && year <= 9999){
            //compute
            if (year % 4 == 0){
                result = yesTrue;
                //System.out.println(yesTrue);
            }else{
                if (year % 100 == 0){
                    result = notTrue;
                    //System.out.println(notTrue);
                }else{
                    if(year % 400 == 0){
                        result = yesTrue;
                        //System.out.println(yesTrue);
                    }else{
                        result = notTrue;
                        //System.out.println(notTrue);
                    }
                }
            }
        }else{
            result = notTrue;
            //System.out.println(notTrue);
        }
        return result;
    }

    /**
     * Instructions
     *
     * if parameter month is < 1 or > 12 return -1
     * if parameter is year is < 1 or > 9999 return -1
     *
     * The method returns the number of days in the month and becareful about the leapYear
     * since they have 29 days in month 2(February)
     *
     * You should check if the year is a leap year using the method isLeapYear
     * @param month
     * @param year
     * @return
     */
    public static int getDaysInMonth(int month, int year){

        boolean check;
        int dayOfMonth = 0;
        if(year < 1 || year > 9999){
            System.out.println("-1");
            return -1;
        }

        if (month >= 1 && month <= 12){
            switch(month){
                case 1:
                    dayOfMonth = 31;
                    check = isLeapYear(year);
                    System.out.println("31 " + check);
                    break;
                case 2:
                    check = isLeapYear(year);
                    if(check == true){
                        dayOfMonth = 29;
                        System.out.println("29 " + year + " is a leap year");

                    }else{
                        dayOfMonth = 28;
                        System.out.println("28 " + year + " is not a leap year");
                    }
                    break;
                case 3:
                    dayOfMonth = 31;
                    check = isLeapYear(year);
                    System.out.println("31 " + check);
                    break;
                case 4:
                    dayOfMonth = 30;
                    check = isLeapYear(year);
                    System.out.println("30 " + check);
                    break;
                case 5:
                    dayOfMonth = 31;
                    check = isLeapYear(year);
                    System.out.println("31 " + check);
                    break;
                case 6:
                    dayOfMonth = 30;
                    check = isLeapYear(year);
                    System.out.println("30 " + check);
                    break;
                case 7:
                    dayOfMonth = 31;
                    check = isLeapYear(year);
                    System.out.println("31 " + check);
                    break;
                case 8:
                    dayOfMonth = 31;
                    check = isLeapYear(year);
                    System.out.println("31 " + check);
                    break;
                case 9:
                    dayOfMonth = 30;
                    check = isLeapYear(year);
                    System.out.println("30" + check);
                    break;
                case 10:
                    dayOfMonth = 31;
                    check = isLeapYear(year);
                    System.out.println("31 " + check);
                    break;
                case 11:
                    dayOfMonth = 30;
                    check = isLeapYear(year);
                    System.out.println("30 " + check);
                    break;
                case 12:
                    dayOfMonth = 31;
                    check = isLeapYear(year);
                    System.out.println("31" + check);
                    break;
                default:
                    System.out.println("Invalid month");
            }
        }else{
            System.out.println("-1");
            return -1;
        }
        return dayOfMonth;
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
