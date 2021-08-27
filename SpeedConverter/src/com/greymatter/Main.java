package com.greymatter;

public class Main {

    public static void main(String[] args) {
        long miles = SpeedConverter.toMilesPerHour(124);
        System.out.println("Miles = " + miles);
        SpeedConverter.printConversion(10.5);
        MegaBytesConverter.printMegaBytesAndKiloBytes(2400);
        System.out.println(BarkingDog.shouldWakeUp(false,-5));

        DecimalComparator.areEqualByThreeDecimalPlaces(-3.1756, -3.175);
    }
}
