package com.greymatter;

import java.math.BigDecimal;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double val1, double val2){
        double auxval1 = (double)((int)(val1*1000d)/1000d);
        double auxval2 = (double)((int)(val2*1000d)/1000d);
        if (auxval1 == auxval2){
            return true;
        }else {
            return false;
        }
    }
}
