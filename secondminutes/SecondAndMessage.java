package com.secondminutes;

import java.text.DecimalFormat;

public class SecondsAndMinutes {

    public static void main(String[] args) {

        /**
        String result = getDaurationString(80,20);
        System.out.println(result);
        */

        String overloadedResult = getDaurationString(3660);
        System.out.println(overloadedResult);

        footerMessage();
    }

    /**
     * Instructions
     * You should validate that the first parameter is >= 0
     * You should validate that the second parameter is >= 0 and <= 59
     * return "Invalid Value" if neither the parameter are true
     *
     * if the parameters are valid then calculate how many hours minutes and seconds
     * equal the minutes and second passed to this method and return that value as string
     * XXh YYm ZZs, XX represents hours, YY represents minutes, ZZ represents seconds
     *
     * Hour = 60 minutes
     * Minutes = 60 seconds
     * or 3600 seconds total
     *
     * @param minutes
     * @param seconds
     */
    public static String getDaurationString(int minutes, int seconds){

        DecimalFormat df = new DecimalFormat("00");
        //base case
        if ((minutes >= 0) || (seconds >= 0 || seconds <= 59)){
            int hours = minutes / 60;
            int mins = minutes % 60;
            return df.format(hours) + "h " + df.format(mins) + "m " + df.format(seconds) + "s";
        }else{
            return "Invalid Values";
        }
    }

    /**
     * Instructions
     * you should validate if the seconds is <= 0
     * return Invalid value otherwise
     * if it is greater than 0 then compute the seconds and
     * call the overloaded method to pass seconds and minutes
     * and get the time frame in XXh YYm ZZs
     * @param seconds
     * @return
     */
    public static String getDaurationString(int seconds){

        if (seconds >= 0){

            int totalMinutes = seconds / 60;
            int totalSeconds = seconds % 60;
            return getDaurationString(totalMinutes, totalSeconds);
        }else{
            return "Invalid Values";
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
        System.out.println("---------------------------");
        System.out.println("App written by: " + copyRight + " Amir 2019");
        System.out.println("---------------------------");
    }
}
