package com.greymatter.whileStatement;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int number = 4;
        int finishNumber = 20;
        int count = 0;

        while (number<=finishNumber){
            number++;
            if (!isNumberEven(number)){
                continue;
            }else {
                count++;
            }

            System.out.println("Even Number " + number);
            if (count>=5){
                System.out.println("5 EVEN NUMBERS FOUND!");
                break;
            }
        }
    }

    public static boolean isNumberEven(int number){
        if (number%2==0){
            return true;
        }else {
            return false;
        }
    }
}
