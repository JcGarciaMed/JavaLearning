package com.greymatter;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int result = 1 + 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);

        int previousResult = result;
        System.out.println("Previous Result " + previousResult);

        result = result - 1; // 3 - 1 = 2
        System.out.println("3 - 1 = " + result);

        System.out.println("Previous Result " + previousResult);

        result = result * 10; // 2 * 10 = 20
        System.out.println("2 * 10 = " + result);

        result = result / 5; // 20 / 5 = 4
        System.out.println("20 / 5  = " + result);

        result = result % 3; // 4 % 3 = 1
        System.out.println("4 % 3  = " + result);

        //result = result + 1;
        result++;
        System.out.println("1 + 1  = " + result);

        //result = result - 1;
        result--;
        System.out.println("2 - 1  = " + result);

        //result = result + 2;
        result+=2;
        System.out.println("1 + 2  = " + result);

        //result = result * 10;
        result*=10;
        System.out.println("3 * 10  = " + result);

        //result = result / 3;
        result/=3;
        System.out.println("30 / 3  = " + result);

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("it is not an alien!!!");
            System.out.println("and i am scared!!!");
        }

        boolean isHuman = true;
        if (isHuman)
            System.out.println("it is Human!!!!");

        int topScore = 80;
        if (topScore == 100){
            System.out.println("You Got the high score!");
        }
        if (topScore != 100){
            System.out.println("You didnt get the high score!");
        }
        if (topScore >= 100){
            System.out.println("You got more than the top score!!!");
        }
        if (topScore <= 100){
            System.out.println("You got less than the top score!!!");
        }

        int secondTopScore = 60;

        if(topScore > secondTopScore && topScore < 100){
            System.out.println("Greater than second top score and less than 100");
        }

        if(topScore > 90 || secondTopScore <= 90){
            System.out.println("Either or  both of the conditions are true");
        }

        boolean isCar = false;
        if(isCar){
            System.out.println("this is not supposed to happen");
        }


        isCar = true;
        boolean wasCar = isCar ? true : false;

        if (wasCar){
            System.out.println("wasCar is true");
        }

        double value1 = 20.00d;
        double value2 = 80.00d;
        double result1 = (value1 + value2) * 100.00d;
        double result2 = result1 % 40.00d;

        boolean result3 =  result2==0? true : false;

        System.out.println("The boolean value : " + result3);

        if (result3 != true){
            System.out.println("Got Some Remainder");
        }

        if (!result3){
            System.out.println("Got Some Remainder");
        }
    }
}
