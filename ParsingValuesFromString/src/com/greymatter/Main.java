package com.greymatter;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String numberAsString = "2018.125";
        System.out.println("numberAsString= " + numberAsString);

        double number = Double.parseDouble(numberAsString);
        System.out.println("number = " + number);

        numberAsString+=1;
        number+=1;
        System.out.println("numberAsString= " + numberAsString);
        System.out.println("number = " + number);

        System.out.println(canPack(1,0,4));
        System.out.println(canPack(1,0,5));
        System.out.println(canPack(0,5,4));
        System.out.println(canPack(2,2,11));
        System.out.println(canPack(-3,2,12));
        System.out.println(canPack(2,7,18));
        System.out.println(canPack(2,1,5));
        System.out.println("larget prime: " + getLargestPrime(21));
        System.out.println("larget prime: " + getLargestPrime(217));
        System.out.println("larget prime: " + getLargestPrime(0));
        System.out.println("larget prime: " + getLargestPrime(45));
        System.out.println("larget prime: " + getLargestPrime(-1));
        printSquareStar(5);
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        if(goal > ((bigCount * 5) + smallCount)) {
            return false;
        }

        if((goal % 5) > smallCount) {
            return false;
        }
        return true;
    }

    public static int getLargestPrime(int number){
        if (number<=1){
            return -1;
        }
        int cont=0;
        for (int i = number; i >= 1 ; i--) {
            if (number%i==0){
                cont = 0;
                for (int j = i; j >=1 ; j--) {
                    if (i%j==0){
                        cont++;
                    }
                }
                if (cont==2){
                    return i;
                }
            }
        }
        return -1;
    }

    public static void printSquareStar(int number){
        if( number < 5) {
            System.out.println("Invalid number");
            return;
        }

        for (int row = 1; row <= number; row++){
            for (int col = 1; col <= number; col++){
                if (row == 1 || row == number || col == 1 || col == number){
                    System.out.print("*");
                } else if (row == col) {
                    System.out.print("*");
                } else if (col == (number - row + 1)) {
                    System.out.print("*");
                } else
                    System.out.print(" ");
            }// close inner loop
            System.out.println();

        }// close outter loop
    }
}
