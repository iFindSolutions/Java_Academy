package com.lasdigitchecker;

public class LastDigitCheck {

    public static void main(String[] args) {

        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit(23, 32, 42));
        System.out.println(hasSameLastDigit(9, 99, 999));
        System.out.println("\n");
        System.out.println(isValid(10));
        System.out.println(isValid(468));
        System.out.println(isValid(1051));
    }

    /**
     * Instructions
     * Check to see if the last digit in ever parameter sent are
     * equal to each other.
     * @param first
     * @param second
     * @param third
     * @return
     */
    public static boolean hasSameLastDigit(int first, int second, int third){

        if((first >= 10 && first <= 1000) && (second >= 10 && second <= 1000) && (third >= 10 && third <= 1000)){

            int a = first % 10;
            int b = second % 10;
            int c = third % 10;
            return ((a == b | a == c) || (b == a || b == c) || (c == a || c == b));
        }
        return false;
    }

    public static boolean isValid(int number){
        return number >= 10 && number <= 1000;
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
