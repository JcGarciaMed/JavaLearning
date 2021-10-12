package com.greymatter.arraysAndLists;
import java.util.Arrays;
import java.util.Scanner;

public class Sorting {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        printArray(sortIntegers(myIntegers));
    }

    public static int[] getIntegers(int capacity){
        int[] array = new int[capacity];
        System.out.println("Enter " + capacity + " integer values:\r" );
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents "+ array[i]);
        }
    }

    public static int[] sortIntegers(int[] arrays){
/*        int[] sortedArray = new int[arrays.length];
        for (int i = 0; i < arrays.length; i++) {
            sortedArray[i] = arrays[i];
        }*/
        int[] sortedArray = Arrays.copyOf(arrays,arrays.length);

        boolean flag = true;
        int temp;
        while (flag){
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]){
                    temp = sortedArray[i];
                    sortedArray[i]= sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
}
