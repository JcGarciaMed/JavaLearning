package com.greymatter;

public class Main {

    public static void main(String[] args) {
	// write your code here
           double centimeters = calcFeetAndInchesToCentimeters(6,0);
           if (centimeters < 0){
               System.out.println("Invalid DATA");
           }
           calcFeetAndInchesToCentimeters(157);
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if ((feet<0) || ((inches <0) || (inches>12))){
            return -1;
        }
        double centimeters = (feet * 12) * 2.54;
        centimeters+= inches * 2.54;
        System.out.println(feet + " feet, " + inches + " inches= " + centimeters + " cm");
        return  centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if (inches < 0){
            return -1;
        }
        double feet = (int) inches/12;
        double remainigInches = (int) inches%12;
        System.out.println(inches + " inches is equal to " + feet + " feet and " + remainigInches);
        return calcFeetAndInchesToCentimeters(feet, remainigInches);
    }
}
