package com.dayoftheweekchallenge;

public class dayOfweekChallenge {

    public static void main(String[] args) {

        printDayOfTheWeek(-1);
        printDayOfTheWeek(1);
        printDayOfTheWeek(2);
        printDayOfTheWeek(3);
        printDayOfTheWeek(4);
        printDayOfTheWeek(5);
        printDayOfTheWeek(6);
        printDayOfTheWeek(7);

        System.out.println("\n\n");

        DayOfTheWeekChallenge(-1);
        DayOfTheWeekChallenge(1);
        DayOfTheWeekChallenge(2);
        DayOfTheWeekChallenge(3);
        DayOfTheWeekChallenge(4);
        DayOfTheWeekChallenge(5);
        DayOfTheWeekChallenge(6);
        DayOfTheWeekChallenge(7);

        System.out.println("\n\n");

        showDayOfTheWeek(0);
        showDayOfTheWeek(1);
        showDayOfTheWeek(2);
        showDayOfTheWeek(3);
        showDayOfTheWeek(4);
        showDayOfTheWeek(5);
        showDayOfTheWeek(6);
        showDayOfTheWeek(7);

    }

    /**
     * Instructions
     * Using a switch statement to print the day of the week
     * return the name of the week using 1-7 integer value
     * else if less than 0 default to show an invalid day
     * @param day
     */
    public static void printDayOfTheWeek(int day){

        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day of the week ");
        }
    }

    /**
     * Instructions
     * Bonus challenge to use an if statements to the
     * same challenge above
     * @param day
     */
    public static void DayOfTheWeekChallenge(int day) {

        if (day == 1){
            System.out.println("Monday");
        }else if(day == 2){
            System.out.println("Tuesday");
        }else if(day == 3){
            System.out.println("Wednesday");
        }else if(day == 4){
            System.out.println("Thursday");
        }else if(day == 5){
            System.out.println("Friday");
        }else if(day == 6){
            System.out.println("Saturday");
        }else if(day == 7){
            System.out.println("Sunday");
        }else{
            System.out.println("Invalid day of the week");
        }
    }

    public static void showDayOfTheWeek(int day){

        //base case
        if(day < 1 || day > 7){
            System.out.println("Invalid day of the week");
        }

        if (day == 1){
            System.out.println("Monday");
        }else{
            if (day == 2){
                System.out.println("Tuesday");
            }else{
                if(day == 3){
                    System.out.println("Wednesday");
                }else{
                    if(day == 4){
                        System.out.println("Thursday");
                    }else{
                        if(day == 5){
                            System.out.println("Friday");
                        }else{
                            if(day == 6){
                                System.out.println("Saturday");
                            }else{
                                if(day == 7){
                                    System.out.println("Sunday");
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
