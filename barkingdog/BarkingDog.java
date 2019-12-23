package com.barkingdog;

public class BarkingDog {

    public static void main(String[] args) {

        //The hours of day has the valid range of 0-23
        shouldWakeUp(true, 1);
        shouldWakeUp(false, 2);
        shouldWakeUp(true, 8);
        shouldWakeUp(true, -1);
        
        footerMessage();
    }

    /**
     * Instructions
     * we have to wake up if the dog is barking before 8 or after 22 hours, so in that case return true
     *
     * In all other cases return false
     *
     * if the hourOfDay parameter is less than 0 or greater 23 return false
     *
     *  Hour of day has a valid rage of 0-23
     *
     * @param barking
     * @param hourOfDay
     * @return
     */
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){

        boolean result = false;

        if (barking == false){
            result = false;
            System.out.println(result);
        }

        if (barking == true){
            if(hourOfDay > 7){
                result = false;
                System.out.println(result);
            }
            if((hourOfDay < 8 || hourOfDay > 22) && (hourOfDay >= 0 && hourOfDay <= 23)){
                result = true;
                System.out.println(result);
            }
            if (hourOfDay < 0){
                result =  false;
                System.out.println(result);
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

