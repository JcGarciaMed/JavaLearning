package com.greymatter.switchs;

public class Main {

    public static void main(String[] args) {
	    int value = 1;
	    if (value==1){
            System.out.println("Value was 1");
        }else if (value==2){
            System.out.println("Value was 2");
        }else {
            System.out.println("Value not 1 or 2");
        }

	    int switchValue = 2;

	    switch (switchValue){
            case 1:
                System.out.println("Value was 1");
                //break;
            case 2: case 3: case 4:
                System.out.println("Value was 2");
                //break;
            default:
                System.out.println("Value was not 1 or 2");
                break;
        }

        char charValue ='A';
	    switch (charValue){
            case 'A':
                System.out.println("A WAS FOUND");
                break;
            case 'B':
                System.out.println("B WAS FOUND");
                break;
            case 'C': case 'D': case 'E':
                System.out.println(charValue + " WAS FOUND");
                break;
            default:
                System.out.println("Could not find A, B ,C ,D E");
                break;
        }
    }

    public static void printNumberInWord(int number){
        switch (number){
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("OTHER");
                break;
        }
    }

    public static boolean isLeapYear(int year){
        if (year < 1 || year > 9999) {
            return false;
        }else{
            if((year%4==0 && year%100>0 )|| (year%400==0)) {
                return true;
            }else {
                return false;
            }
        }
    }


    public static int getDaysInMonth(int month, int year){
        if ((month < 1 || month > 12) || (year < 1 || year > 9999)){
            return -1;
        }else {
            switch (month){
                case 1:case 3:case 5:case 7:case 8:case 10:case 12:
                    return 31;
                case 2:
                    if (isLeapYear(year)){
                        return 29;
                    }else {
                        return 28;
                    }
                case 4: case 6:case 9:case 11:
                    return 30;
                default:
                    return -1;
            }
        }
    }


}
