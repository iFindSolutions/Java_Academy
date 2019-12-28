package com.inputcalculator;

import java.util.Scanner;

public class inputcalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage(){

        Scanner kb = new Scanner(System.in);
        int sum = 0;
        int avg = 0;
        int counter = 0;
        while(true){

            boolean isInt = kb.hasNextInt();
            if(isInt){
                int input = kb.nextInt();
                sum += input;
                avg = sum;
                counter++;
            }else{
                avg /= counter;
                System.out.println("SUM = " + sum + " AVG = " + avg);
                break;
            }
            kb.nextLine();
        }


    }
}

