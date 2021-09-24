package com.greymatter.speedConverter;

public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        boolean wakeUP = false;

        if (barking == true && (hourOfDay < 8 || hourOfDay > 22) && (hourOfDay >= 0 && hourOfDay <= 23)) {
            wakeUP = true;
        }else {
            wakeUP = false;
        }

        return wakeUP;
    }
}
