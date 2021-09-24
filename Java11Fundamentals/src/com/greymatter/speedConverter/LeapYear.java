package com.greymatter.speedConverter;

public class LeapYear {
    public static boolean isLeapYear(int year){
        boolean result;

        if (year < 1 || year > 9999){
            result = false;
        }else{
            if (year % 4 == 0){
                if (year % 100 == 0){
                    if (year % 400 == 0){
                        result = true;
                    }else {
                        result = false;
                    }
                }else {
                    result = true;
                }
            }else {
                result = false;
            }
        }

        return result;
    }
}
