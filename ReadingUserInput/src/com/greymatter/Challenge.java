package com.greymatter;

import java.util.Scanner;

public class Challenge {
    public static void main(String[] args) {
        // write your code here
        inputThenPrintSumAndAverage();

    }

   public static void inputThenPrintSumAndAverage(){
       Scanner scanner = new Scanner(System.in);
       double cont = 0;
       int sum = 0;
       while (true){
           System.out.println("Enter Number: ");
           if(scanner.hasNextInt()){
               cont++;
               int valor = scanner.nextInt();
               sum = sum + valor;
           }else {
               break;
           }
       }
       double averageAux = sum/cont;
       long average = Math.round((averageAux));
       System.out.println("SUM = " + sum + " AVG = " + average);
       scanner.close();
   }
}
