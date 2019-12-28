package com.paintjob;

public class PaintJob {
    public static void main(String[] args) {

        System.out.println(getPaintJob(-3.4, 2.1, 1.5, 2));
        System.out.println(getPaintJob(3.4, 2.1, 1.5, 2));
        System.out.println(getPaintJob(2.75, 3.25, 2.5, 1));
        System.out.println();
        System.out.println(getPaintJob(-3.4, 2.1, 1.5));
        System.out.println(getPaintJob(3.4, 2.1, 1.5));
        System.out.println(getPaintJob(7.25, 4.3, 2.35));
        System.out.println();
        System.out.println(getPaintJob(3.4, 1.5));
        System.out.println(getPaintJob(6.26, 2.2));
        System.out.println(getPaintJob(3.26, 0.75));

    }

    /**
     * Instructions
     *
     * Width: this represent the width of the wall
     * Height: this represent the height of the wall
     * areaPerBucket: this represents the area that can be covered with one bucket of paint
     * extraBuckets: this represents the bucket count Bob has at home
     *
     * this method needs to return a value of int that represents the number of buckets that
     * Bob needs to buy before going to the work.
     *
     * if one of the parameters width, height or areaPerBucket is less or equal to 0 or if
     * extra buckets is less than 0, the method needs to return -1. else do the calculations to return
     * the number of buckets
     * @param width
     * @param height
     * @param areaPerBucket
     * @param extraBuckets
     * @return
     */
    public static int getPaintJob(double width, double height, double areaPerBucket, int extraBuckets){

        if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0){
            return -1;
        }
        double totalBucketsCount = ((width*height)/areaPerBucket) - extraBuckets;
        return (int)Math.ceil(totalBucketsCount);
    }

    /**
     * Instructions
     * Overloaded method
     * This method needs to return the number of buckets that Bob needs
     * before going to work
     *
     * @param width
     * @param height
     * @param areaPerBucket
     * @return
     */
    public static int getPaintJob(double width, double height, double areaPerBucket){

        if(width <= 0 || height <= 0 || areaPerBucket <= 0){
            return -1;
        }
        double totalBucketCount = (width*height) / areaPerBucket;
        return (int)Math.ceil(totalBucketCount);
    }

    /**
     * Instructions
     * Overloaded method
     * This method needs to return the number of buckets that Bob needs
     * before going to work
     *
     * @param area
     * @param areaPerBucket
     * @return
     */
    public static int getPaintJob(double area, double areaPerBucket){

        if(area <= 0 || areaPerBucket <= 0){
            return -1;
        }
        double areaTotal = area / areaPerBucket;
        return (int)Math.ceil(areaTotal);
    }
}
