package com.speedConverter;

import java.text.DecimalFormat;

public class SpeedConvert {

    public static void main(String[] args){

        //pass in any value for kilometers
        //Note: this is only showing for converting from kph to mph
        double kilometersPerHour = toMilesPerHour(75.114);
        if(kilometersPerHour > 0){
            printConversion(kilometersPerHour);
        }else {
            DecimalFormat df = new DecimalFormat("#");
            System.out.println(df.format(kilometersPerHour));
        }

        //show the footer message
        footerMessage();
    }

    /**
     * One mile is about [ 1.60934 ] kilometers
     * One kilometer is about [ 0.621371 ] mile
     * @param kilometersPerHour
     * @return
     */
    public static double toMilesPerHour(double kilometersPerHour){

        //base case for invalid value
        if (kilometersPerHour < 0){
            return -1;
        }
        double result  = (kilometersPerHour * 0.621371);

        return result;
    }

    public static void printConversion(double kilometersPerHour){

        //base case
        if (kilometersPerHour < 0){
            System.out.println("Invalid Value!");
        }

        if (kilometersPerHour > 0){
            long milesPerHour = Math.round(kilometersPerHour);
            System.out.println("kilometers Conversion");
            System.out.println(kilometersPerHour + "kph = " + milesPerHour + "mph");
        }
    }

    /**
     * This is the footer method to show copyRight
     * by AMIR AYOUB 2019
     */
    public static void footerMessage(){

        //print out the copy right unicode
        char copyRight =  '\u00A9';
        System.out.println("\n\n");
        System.out.printf("%25s", "----------------------");
        System.out.println();
        System.out.println("App written by: " + copyRight + " Amir 2019");
    }
}
