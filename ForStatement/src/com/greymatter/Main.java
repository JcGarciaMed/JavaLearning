package com.greymatter;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("10,000 at 1% interest = " + calculateInterest(10000,1));
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000,2));
        System.out.println("10,000 at 3% interest = " + calculateInterest(10000,3));
        System.out.println("10,000 at 4% interest = " + calculateInterest(10000,4));
        System.out.println("10,000 at 5% interest = " + calculateInterest(10000,5));

        for (int i = 0; i < 5; i++) {
            System.out.println("Loop " + i + " hello!");
        }

        double amount = 10000d;
        for (int i = 2; i < 9; i++) {
            System.out.println(" " + amount + " at " + i + "% interest=  " + String.format("%.2f", calculateInterest(amount, i)));
        }
        System.out.println("**********************");
        for (int i = 8; i > 1; i--) {
            System.out.println(" " + amount + " at " + i + "% interest=  " + String.format("%.2f", calculateInterest(amount, i)));
        }
        System.out.println("**********************");
        int primeNumbers = 0;
        for (int i = 58; i < 1250; i++) {
            if (isPrime(i)){
                System.out.println("Prime Number: " + i);
                primeNumbers++;
                if (primeNumbers >= 3){
                    break;
                }
            }
        }



    }

    public static double calculateInterest(double amount, double interestRate){
        return (amount * (interestRate/100));
    }

    public static boolean isPrime(int n){
        if (n == 1){
            return false;
        }

        for (int i = 2; i <= n/2 ; i++) {
            if (n%i == 0){
                return  false;
            }
        }

        return true;
    }

    public static boolean isOdd(int number){
        if(number<=0){
            return false;
        }else{
            if (number%2==0){
                return  true;
            }else{
                return false;
            }
        }
    }

    public static int sumOdd(int start,int end){
        if ((end < start) || start ==0 || end == 0){
            return  -1;
        }
        int acum = 0;
        for (int i = start; i <= end ; i++) {
            if (isOdd(i)){
                acum = acum + i;
            }
        }
        return acum;
    }
}
