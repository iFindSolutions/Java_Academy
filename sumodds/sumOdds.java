package com.sumodds;

public class sumOdds {
    public static void main(String[] args) {

        System.out.println(sumOdd(1, 100));
        System.out.println(sumOdd(-1, 100));
        System.out.println(sumOdd(100, 100));
        System.out.println(sumOdd(13, 13));
        System.out.println(sumOdd(100, -100));
        System.out.println(sumOdd(100, 1000));
        System.out.println(sumOdd(1, 11));
        System.out.println(sumOdd(20, 5));


    }

    /**
     * Instructions
     * Check that the number is > 0
     * if number is odd then return true, otherwise false
     *
     * Write a second method called sumOdd that has 2 int parameters
     * start and end, which represents a range of numbers
     *
     * The method should use a for loop to sum all odd numbers in that range
     * including the end and return the sum
     *
     * it should call the method isOdd to check if each number is odd
     *
     * The parameter end needs to be greater than or equal to start and both
     * start and end parameters have to be greater than 0
     *
     * if those conditions are not satisfied return -1 from the method to indicate invalid input
     * @param num
     * @return
     */
    public static boolean isOdd(int num){
        if (num < 0){
            return false;
        }
        for (int i = 0; i < Math.sqrt(num); i++){
            if(num % 2 != 0){
                return true;
            }
        }
        return false;
    }

    public static int sumOdd(int start, int end){

        int sum = 0;
        if (start < 0 || end < 0 || end < start){
            return -1;
        }
        for(int i = start; i <= end; i++){
            if(isOdd(i)){
                sum+=i;
            }
        }
        return sum;
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
