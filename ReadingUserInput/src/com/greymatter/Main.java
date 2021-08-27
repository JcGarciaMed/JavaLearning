package com.greymatter;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        sumTenNumbers();

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Enter your year of birth: ");
        if(scanner.hasNextInt()){
            int yob = scanner.nextInt();
            scanner.nextLine();

            System.out.printf("Enter your name: ");
            String name = scanner.nextLine();

            int age = 2018-yob;

            System.out.printf("Your name is: " + name + " and you are " + age + " years old");
        }else {
            System.out.printf("unable to parse year of birth");
        }

        scanner.close();
    }

    public static void sumTenNumbers(){
        Scanner scanner = new Scanner(System.in);
        String message = "Enter number#";
        int sum=0;

        for (int i= 1; i<=10 ; i++) {
            System.out.println(message + i + " :");
            if(scanner.hasNextInt()){
                sum = sum + scanner.nextInt();
                scanner.nextLine();
            }else {
                System.out.println("Invalid Value");
            }

        }
        System.out.println("Suma de numeros: " + sum);
        scanner.close();
    }
}
