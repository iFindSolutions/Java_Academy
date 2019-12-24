package com.playingcat;

public class PlayingCat {

    private static final boolean catIsPlaying = true;
    private static final boolean catIsNotPlaying = false;

    public static void main(String[] args) {

        isCatPlaying(true, 10);
        isCatPlaying(false, 36);
        isCatPlaying(false, 35);
    }

    /**
     * Instructions
     * Cats play when the temperature is between 25 and 35(inclusive)
     * Unless it is summer then the upper limits 45(inclusive) instead of 35
     *
     * summer represents if it is summer as true or false
     * temperature represents if the cat is playing or not return true or false
     * @param summer
     * @param temperature
     * @return
     */
    public static boolean isCatPlaying(boolean summer, int temperature){

        if (temperature < 0){
            System.out.println(catIsNotPlaying);
            return catIsNotPlaying;
        }else{
            if (summer){
                if(temperature >= 25 && temperature <= 45){
                    System.out.println(catIsPlaying);
                    return catIsPlaying;
                }else{
                    System.out.println(catIsNotPlaying);
                    return catIsNotPlaying;
                }
            }else {
                if(temperature >= 25 && temperature <= 35){
                    System.out.println(catIsPlaying);
                    return catIsPlaying;
                }else{
                    System.out.println(catIsNotPlaying);
                    return catIsNotPlaying;
                }
            }

        }
    }
}
