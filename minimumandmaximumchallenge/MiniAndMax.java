package com.minimumandmaximumchallenge;

import java.util.Scanner;

public class MiniAndMax {
    public static void main(String[] args) {


        System.out.println(Math.max(2, 10));
        System.out.println(Math.min(2, 10));
        Scanner kb = new Scanner(System.in);
        boolean flag = true;
        int max = 0;
        int min = 0;
        while(true){
            System.out.print("Enter number: ");
            boolean hasNextInt = kb.hasNextInt();
            if(hasNextInt){
                int userInput = kb.nextInt();
                if(flag){
                    flag = false;
                    max = userInput;
                    min = userInput;
                }
                if(userInput > max){
                    max = userInput;
                }
                if(userInput < min){
                    min = userInput;
                }
            }else{
                System.out.println("Maximum number: "+ max);
                System.out.println("Minimum number: "+ min);
                break;
            }
        }

        kb.close();
    }

    public static int min(int a, int b){
        return (a <= b) ? a : b;
    }

    public static int max(int a, int b){
        return (a >= b) ? a : b;
    }

    public static void anotherWayToGetMinAndMax(){

        Scanner kb = new Scanner(System.in);
        int max = -2147483648;
        int min = 2147483647;

        while(true){
            System.out.print("Enter number: ");
            boolean isInt = kb.hasNextInt();
            if(isInt){
                int number = kb.nextInt();
                if(number > max){
                    max = number;
                }
                if(number < min){
                    min = number;
                }
            }else{
                System.out.println("Max: " + max);
                System.out.println("Min: " + min);
                break;
            }
            kb.nextLine(); //to handle the next line
        }

        kb.close();
    }
}
