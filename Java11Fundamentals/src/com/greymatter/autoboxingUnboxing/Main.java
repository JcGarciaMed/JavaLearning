package com.greymatter.autoboxingUnboxing;

import java.util.ArrayList;

class IntClass {
    private int value;

    public IntClass(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

public class Main {
    public static void main(String[] args) {
        String[] strArray = new String[10];
        int[] intArray = new int[15];

        ArrayList<String> strArraylist = new ArrayList<String>();
        //ArrayList<int> intArraylist1 = new ArrayList<int>();
        ArrayList<IntClass> intArraylist2 = new ArrayList<IntClass>();
        intArraylist2.add(new IntClass(29));

        Integer integer = new Integer(55);
        Double ddouble = new Double(92.65);
        Integer integer1 = integer;
        integer = 12;
        System.out.println(integer + " " + integer1);

        ArrayList<Integer> intArraylist = new ArrayList<Integer>();

 /*       for (int i = 0; i <=10 ; i++) {
            intArraylist.add(Integer.valueOf(i));
        }

        for (int i = 0; i <=10 ; i++) {
            System.out.println(i + " --> " + intArraylist.get(i).intValue());
        }*/

        Integer myIntValue = 56;
        int myInt = myIntValue.intValue();

        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
        for (double dbl=0.00; dbl<=10.0; dbl+=0.5){
            myDoubleValues.add(Double.valueOf(dbl));
        }

        for (int i=0; i<myDoubleValues.size(); i++){
            double value = myDoubleValues.get(i).doubleValue();
            System.out.println(i + " --> " + value);
        }

    }

}
