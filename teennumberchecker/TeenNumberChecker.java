package com.teennumberchecker;

public class TeenNumberChecker {

    public static void main(String[] args) {

        System.out.println("Teen Age Check");
        System.out.printf("%-1s", "-------------------\n");
        hasTeen(9, 99, 19);
        hasTeen(23, 15, 42);
        hasTeen(22, 23, 34);
        System.out.printf("%-1s", "-------------------\n");


        System.out.printf("%-1s", "-------------------\n");
        isTeen(9);
        isTeen(13);
        System.out.printf("%-1s", "-------------------\n");

        footerMessage();
    }

    /**
     * Instructions
     * The boolean method should return true if one of the parameters is in the
     * range of 13(inclusive) - 19(inclusive)
     * @param one
     * @param two
     * @param three
     * @return
     */
    public static boolean hasTeen(int one ,int two, int three){

        boolean result;
        //base case
        if ((one < 0) && (two < 0) && (three < 0)) {
            result = false;
            System.out.println(result + " not born yet");
        }
        if ((one >= 13 && one <= 19) || (two >= 13 && two <= 19) || (three >= 13 && three <= 19)){
            result = true;
            System.out.println(result + " is a teen");
        }else {
            result = false;
            System.out.println(result + " is not a teen");
        }
        return result;
    }

    /**
     * Instructions
     * The method is boolean and takes one parameter
     * it should check if the value is in the range of 13(inclusive) - 19(inclusive)
     * return true else return false
     * @param one
     * @return
     */
    public static boolean isTeen(int one){

        boolean result;
        if (one < 0){
            result = false;
            System.out.println(result);
        }
        if (one >= 13 && one <= 19){
            result = true;
            System.out.println(result + " is a teen");
        }else{
            result = false;
            System.out.println(result + " is not a teen");
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
