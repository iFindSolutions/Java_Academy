package com.printfactors;

public class AllFactors {
    public static void main(String[] args) {

        printFactors(6);
        System.out.println();
        printFactors(32);
        System.out.println();
        printFactors(10);
        System.out.println();
        printFactors(-1);

        footerMessage();

    }

    public static void printFactors(int number){

        if(number < 1){
            System.out.println("Invalid Value");
        }else{
            //Answer: 1, 2, 3, 6
            for(int i = 1; i <= number; i++){
                if(number % i == 0){
                    System.out.printf("%-4d",i);
                }
            }
        }
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
