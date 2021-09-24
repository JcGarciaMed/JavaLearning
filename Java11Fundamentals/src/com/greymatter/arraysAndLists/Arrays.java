package com.greymatter.arraysAndLists;
import java.util.Scanner;

public class Arrays {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntArray = new int[10];
        myIntArray[5]=50;
        myIntArray[9]=125;
        myIntArray[1]=5526;
        System.out.println(myIntArray[5]);
        System.out.println(myIntArray[1]);

        int[] myIntArray2 = {1,2,3,4,5,9,8,10,12};
        System.out.println(myIntArray2[8]);

        int[] myIntArray3= new int[10];
        for (int i = 0; i < myIntArray3.length; i++) {
            myIntArray3[i]= i*10;
            System.out.println("Element: " + i + " , value: " +  myIntArray3[i]);
        }
        double[] myDobuleArray = new double[198];

        int[] myIntegers = getIntegers(5);
        for (int i = 0; i < myIntegers.length; i++) {
            System.out.println("Element " + i + " , typed value was " + myIntegers[i]);
        }

        System.out.println("Average is : " + getAverage(myIntegers));
    }

    public static int[] getIntegers(int numbers){
        System.out.println("Enter " + numbers + " Integer Values.\r");
        int[] values = new int[numbers];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static double getAverage(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (double) sum/(double) array.length;
    }
}
