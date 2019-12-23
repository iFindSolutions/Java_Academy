package com.megabyteconverter;

public class MegabyteConverter {

    public static void main(String[] args) {

        printMegaBytesAndKiloBYtes(-2500);

        footerMessage();
    }

    /**
     * Instructions
     * Use remainder operator
     * 1 MB = 1024 KB <---- we are working with binary
     * Do not set kilobytes parameter value inside your method
     * 1 MB = 1000 KB (in decimal)
     * 1 MB = 1024 KB (in binary)
     * Base 10 (decimal)
     * 1 MB = 10^2 bytes
     * 1 MB - 1,000,000 bytes
     * Base 2 (binary)
     * 1 MB = 2^20 bytes
     * 1 MB = 1024^2 bytes
     * 1 MB = 1,048,576 bytes
     *
     * Kilobytes in Megabytes
     * 1 Megabyte is equal to 1000 kilobytes (decimal)
     * 1 MB = 10^3 KB in base 10
     *
     * 1 Megabyte is equal to 1024 kilobytes (binary)
     * 1 MB = 2^10 Kb in base 2
     *
     * 1 Kb = 0.001 MB (in decimal)
     * 1 Kb = 0.0009765625 MB (in binary)
     * @param kiloBytes
     */
    public static void printMegaBytesAndKiloBYtes(long kiloBytes){

        //base case
        if (kiloBytes < 0){
            System.out.println("Invalid Value");
            System.exit(0); //exit here and do nothing else
        }

        //get the remainder of kilobytes
        long remainder = kiloBytes % 1024;
        //get the Megabytes
        double result = kiloBytes * 0.0009765625;
        System.out.println((long)result + " MB and " + remainder + " KB");
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
