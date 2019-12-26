package com.perfectnumber;

public class PerfectNumber {

    public static void main(String[] args) {

        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));
        System.out.println(isPerfectNumber(9));


    }

    /**
     * Instructions
     * A perfect number is a positive integer which is equal to the sum of
     * its proper positive divisors.
     *
     * Proper positive divisors are positive integers that fully divide the
     * the perfect number without leaving a remainder and exclude the perfect
     * number itself.
     *
     * 6, its proper divisors are 1, 2, and 3 (since 6 is value of the perfect number, it is excluded)
     * and the sum of its proper divisors 1 + 2 + 3 = 6 which is equal to the first perfect number
     * @param number
     * @return
     */
    public static boolean isPerfectNumber(int number){
        int sum = 0;
        boolean result = false;
        if (number < 1){
            return false;
        }else{
            for(int i = 1; i < number; i++){
                sum += i;
                if(number % i == 0){
                    if(number == number){
                        if(sum == number){
                            System.out.println(sum);
                            result = true;
                            return result;
                        }
                    }
                }
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
