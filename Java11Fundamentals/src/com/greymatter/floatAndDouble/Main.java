package com.greymatter.floatAndDouble;

public class Main {

    public static void main(String[] args) {
	// write your code here
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value : " + myMinFloatValue);
        System.out.println("Float maximum value : " + myMaxFloatValue);

        double myMindoubleValue = Double.MIN_VALUE;
        double myMaxdoubleValue = Double.MAX_VALUE;
        System.out.println("double minimum value : " + myMindoubleValue);
        System.out.println("double maximum value : " + myMaxdoubleValue);

        int myIntValue = 5 / 3;
        //float myFloatValue = (float) 5.52;
        //float myFloatValue = 5.52d;
        //double myDoubleValue = 5.25d;
        float myFloatValue = 5f / 3;
        double myDoubleValue = 5d / 3;
        System.out.println("MyIntValue : " + myIntValue);
        System.out.println("MyFloatValue: " + myFloatValue);
        System.out.println("MyDoubleValue : " + myDoubleValue);

        double poundKgValue = 0.45359237;
        double wPounds = 60;
        double wKilograms = wPounds * poundKgValue;
        System.out.println(wKilograms);

        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_525_255d;
        System.out.println(pi);
        System.out.println(anotherNumber);



    }
}
