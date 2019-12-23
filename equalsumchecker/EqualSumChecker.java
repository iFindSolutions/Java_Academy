package com.equalsumchecker;

public class EqualSumChecker {
    public static void main(String[] args) {

        hasEqualSum(1,1,1);
        hasEqualSum(1,1,2);
        hasEqualSum(1,-1,0);
        hasEqualSum(1,2,-1); //this should equal to true and not false
        hasEqualSum(2,1, 1);
        hasEqualSum(1,1,3);

        footerMessage();
    }

    /**
     * Instructions
     * Take the first and second number add them up and check if the
     * number is equal to the third number
     * @param first
     * @param second
     * @param third
     * @return
     */
    public static boolean hasEqualSum(int first, int second, int third){

        boolean result = false;
        if (((first - second) == third) || ((first + second) == third)){
            result = true;
            System.out.println(result);
        }else{
            result = false;
            System.out.println(result);
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
