package com.barkingdog;

public class BarkingDog {

    public static void main(String[] args) {

        //The hours of day has the valid range of 0-23
        shouldWakeUp(true, 1);
        shouldWakeUp(false, 2);
        shouldWakeUp(true, 8);
        shouldWakeUp(true, -1);
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
}

