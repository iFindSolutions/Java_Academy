package com.areacalculator;

import java.text.DecimalFormat;

public class AreaCalculator {

    private static final double negative = -1.0;

    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("##.#####");
        /**
         * Test cases
         * area(-1)
         * area(5.0)
         * area(-1.0, 4.0)
         * area(5.0, 4.0)
         * area(0.0)
         */
        double result = area(-1);
        if (result == 0){
            System.out.println(result);
            System.exit(0);
        }
        System.out.println(df.format(result));
    }

    /**
     * Instructions
     * if the parameter radius is negative then return -1.0 to represent a invalid value
     *
     * Compute the area of the circle
     * May use the Math class
     * Math.PI
     * radius * radius * Math.pI
     *
     * This method should return the value that represents the area of circle
     * @param radius
     * @return
     */
    public static double area(double radius){

        if (radius <= negative){
            return negative;
        }else {
            double result = radius * radius * Math.PI;
            return result;
        }
    }

    /**
     * Instructions
     * Overloaded Method
     * Just multiply x * y to calculate the are of the rectangle
     * This method should return the area of the rectangle
     * @param x
     * @param y
     * @return
     */
    public static double area(double x, double y){

        if (x < 0 || y < 0){
            return negative;
        }else {
            double result = x * y;
            return result;
        }
    }
}
