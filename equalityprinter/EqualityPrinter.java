package com.equalityprinter;

public class EqualityPrinter {
    public static void main(String[] args) {

        printEqual(1, 1, 1);
        printEqual(1, 1, 2);
        printEqual(-1, -1, -1);
        printEqual(1, 2, 3);
        printEqual(1, 2, 1);
        printEqual(2, 1, 1);
    }

    /**
     * Instructions
     * If even of the values sent as parameters are less than 0 print Invalid value
     * If all numbers are equal then print "All numbers are equal"
     * if all numbers are different then print "All numbers are different'
     * Otherwise print "Neither all or equal or different"
     * @param num1
     * @param num2
     * @param num3
     */
    public static void printEqual(int num1, int num2, int num3){

        if (num1 < 0 || num2 < 0 || num3 < 0){
            System.out.println("Invalid Value");
        }else{
            if (num1 == num2 && num2 == num3 && num3 == num1){
                System.out.println("All numbers are equal");
            }else if(num1 == num2){
                if(num2 == num3){
                    System.out.println("All numbers are equal");
                }else{
                    System.out.println("Neither all are equal or different");
                }
            }else{
                if(num3 == num1){
                    System.out.println("Neither all are equal or different");
                }else if(num3 == num2){
                    System.out.println("Neither all are equal or different");
                }else{
                    System.out.println("All numbers are different");
                }
            }
        }
    }
}
