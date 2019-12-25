package com.numberinword;

public class NumberInWord {
    public static void main(String[] args) {

        printNumberInWord(-1);
        printNumberInWord(1);
        printNumberInWord(2);
        printNumberInWord(3);
        printNumberInWord(4);
        printNumberInWord(5);
        printNumberInWord(6);
        printNumberInWord(7);
        printNumberInWord(8);
        printNumberInWord(9);
        printNumberInWord(10);

    }

    /**
     * Instructions
     * Print the word based on the number passed as the parameter
     * Ex. 0 will be ZERO
     * And 1 will be ONE
     *
     * All Strings output should be uppercase
     *
     * And most important thing just play around with if statement
     * and Switch statement
     * have fun
     *
     * @param number
     */
    public static void printNumberInWord(int number){

        if(number < 0){
            System.out.println("OTHER");
        }
        if(number == 0){
            System.out.println("ZERO");
        }else{
            if(number == 1){
                System.out.println("ONE");
            }else{
                if(number == 2){
                    System.out.println("TWO");
                }else{
                    if(number >= 3){
                        switch(number){
                            case 3:
                                System.out.println("THREE");
                                break;
                            case 4:
                                System.out.println("FOUR");
                                break;
                            case 5:
                                System.out.println("FIVE");
                                break;
                            case 6:
                                System.out.println("SIX");
                                break;
                            case 7:
                                System.out.println("SEVEN");
                                break;
                            case 8:
                                System.out.println("EIGHT");
                                break;
                            default:
                                if(number == 9){
                                    System.out.println("NINE");
                                }else{
                                    if(number > 9){
                                        System.out.println("OTHER");
                                    }
                                }
                        }
                    }
                }
            }
        }
    }
}
