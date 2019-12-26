package com.hasshareddigit;

public class SharedDigit {
    public static void main(String[] args) {

        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
        System.out.println(hasSharedDigit(25, 22));
        System.out.println(hasSharedDigit(15, 23));
        System.out.println(hasSharedDigit(19, 99));

        System.out.println("More efficient way to write ");
        System.out.println(sharedDigit(12, 23));
        System.out.println(sharedDigit(9, 99));
        System.out.println(sharedDigit(15, 55));
        System.out.println(sharedDigit(25, 22));
        System.out.println(sharedDigit(15, 23));
        System.out.println(sharedDigit(19, 99));


        footerMessage();
    }

    /**
     * Instructions
     * if the first and second number are less than 10 or 99
     * return false otherwise do the computation
     *
     * based on what I learned I have implemented a for loops
     * and so check to see if the numbers from either numbers enetered shared
     * digits so return true if they do else return false
     * @param first
     * @param end
     * @return
     */
    public static boolean hasSharedDigit(int first, int end){
        boolean result = false;
        int arrFirst[], arrSecond[];
        int arr2First[], arr2Second[];
        if ((first >= 10 && first <= 99) && (end >= 10 && end <= 99)) {
            arrFirst = new int[99];
            arrSecond = new int[99];
            arr2First = new int[99];
            arr2Second = new int[99];
            for(int i = 0; i < arrFirst.length; i++){
                arrFirst[i] = first / 10;
                //System.out.println(arrFirst[i]);
                for(int j = 0; j < arrSecond.length; j++){
                    arrSecond[j] = first % 10;
                    //System.out.println(arrFirst[i] + " " + arrSecond[j]);
                    for(int a = 0; a < arr2First.length; a++){
                        arr2First[a] = end / 10;
                        for(int b = 0; b < arr2Second.length; b++){
                            arr2Second[b] = end % 10;
                            if((arrFirst[i] == arr2First[a]) || (arrFirst[i] == arr2Second[b]) ||
                                    (arrSecond[j] == arr2First[a]) || (arrSecond[j] == arr2Second[b])){
                                //System.out.println(arrFirst[i] + " " + arrSecond[j] + " " + arr2First[a] + " " + arr2Second[b]);
                                result = true;
                                return result;
                            }
                        }

                    }
                }
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
