package com.greymatter;

public class Main {

    public static void main(String[] args) {

        int myvalue = 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        System.out.println("Busted Maximum Value = " + (myMaxIntValue+1));
        System.out.println("Busted Minimum Value = " + (myMinIntValue-1));

        //int myMaxIntTest = 2147483648; Error!!!!!!!!
        int myMaxIntTest = 2_147_483_647;
        System.out.println("Int Max Test " + myMaxIntTest);

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);      
        
        long myLongValue = 100;
        long bigLongLiteralValue = 2_147_483_647L;
        long myMinlongValue = Long.MIN_VALUE;
        long myMaxlongValue = Long.MAX_VALUE;
        System.out.println("long Minimum Value = " + myMinlongValue);
        System.out.println("long Maximum Value = " + myMaxlongValue);
        System.out.println("big long literal value= " + bigLongLiteralValue);

        short bigShortLiteralValue = 32767;
        int mytotal = myMinIntValue / 2;
        byte myNewByteValue = (byte) (myMinByteValue / 2);
        short myNewShortValue = (short) (myMinShortValue/2);

        byte byteExample = 3;
        short shortExample = 234;
        int intExample = 23545;

        long longExample = 50000 + 10 * (byteExample + shortExample + intExample);

        System.out.println(longExample);


    }
}

