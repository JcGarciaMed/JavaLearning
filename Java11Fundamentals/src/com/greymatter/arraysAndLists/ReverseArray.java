package com.greymatter.arraysAndLists;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array= {1,2,3,4,5,19,23};
        System.out.println("array: " + Arrays.toString(array));
        System.out.println("array reverse2: " + Arrays.toString(reverse2(array)));
        reverse(array);
        System.out.println("Reverse array: " + Arrays.toString(array));
    }
    public static void reverse(int[] array){
        int maxIndex = array.length-1;
        int halfLength = array.length/2;
        for (int i = 0; i < halfLength; i++) {
            int temp = array[i];
            array[i] = array[maxIndex-i];
            array[maxIndex-i] = temp;
        }
    }

    public static int[] reverse2(int[] array){
        int maxIndex = array.length-1;
        int index = 0;
        int[] arrayreturned = new int[array.length];
        for (int i = maxIndex; i >= 0; i--) {
            arrayreturned[index]= array[i];
            index++;
        }
        return arrayreturned;
    }
}
