package com.greymatter;

public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature){
        int from = 25;
        int to;
        if (summer){
            to = 45;
        }else {
            to = 35;
        }
        if (temperature >= from && temperature <=to){
            return true;
        }else {
            return false;
        }
    }
}
