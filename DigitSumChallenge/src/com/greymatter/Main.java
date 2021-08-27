package com.greymatter;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println(sumDigits(1));
        System.out.println(isPalindrome(122));
        System.out.println("sum first and last : " + sumFirstAndLastDigit(1266));
        System.out.println("sum evens: " + getEvenDigitSum(724196));
        System.out.println("has Shared digit: " + hasSharedDigit(21,12));
        getGreatestCommonDivisor(14,22);
        printFactors(522);
        isPerfectNumber(6);
        reverse(100);
        getDigitCount(1);
        numberToWords(0);

    }
    public static int sumDigits(int number){
        if(number<10){
            return -1;
        }

        int sum = 0;

        while (number>0){
            int digit = number%10;
            sum+=digit;
            number/=10;
        }
        return sum;
    }

    public static boolean isPalindrome(int number){
        int originalValue = 0;
        int palindrome = 0;
        int multi = 1;
        if(number<0){
            originalValue = number * -1;
            number = number * -1;
        }else {
            originalValue = number;
        }

        while (number>0){
            int digit = number%10;
            palindrome*=10;
            palindrome+=digit;
            number/=10;
        }

        if (originalValue == palindrome){
            return true;
        }else {
            return false;
        }
    }

    public static int sumFirstAndLastDigit(int number){
        int firstDigit = 0;
        int lastDigit = 0;
        int count=0;

        if(number<0){
            return -1;
        }

        if (number/10 == 0){
            return number + number;
        }

        while (number>0){
            count++;
            if (count==1){
                lastDigit= number%10;
            }
            number/=10;
            if (number>0){
                firstDigit = number;
            }
            System.out.println(number);
        }

        return firstDigit + lastDigit;
    }


    public static int getEvenDigitSum(int number){
        int digit = 0;
        int sumPair = 0;

        if(number<0){
            return -1;
        }

        while (number>0){
            digit= number%10;

            if (digit%2 == 0){
                sumPair = sumPair + digit;
            }

            number/=10;
        }

        return sumPair;
    }

    public static boolean hasSharedDigit(int from, int to){

        if ((from < 10 || from > 99) || (to < 10 || to > 99) ){
            return false;
        }

        int digitFrom = 0;
        int digitTo = 0;


        while (from>0){
            digitFrom= from%10;
            System.out.println("While Fuera: " + digitFrom);
            int auxTo = to;

            while (auxTo>0){
                digitTo= auxTo%10;
                System.out.println("  While dentro: " + digitFrom);
                if (digitFrom == digitTo){
                    return true;
                }
                auxTo/=10;
            }
            from/=10;
        }

        return false;
    }

    public static boolean hasSameLastDigit(int parm1, int parm2, int parm3){
        if (!isInRange(parm1) || !isInRange(parm2) || !isInRange(parm3)){
            return false;
        }

        int[ ] numeros = {parm1, parm2, parm3};
        int[ ] digitos = {0, 0, 0};

        for (int i = 0; i <= 2; i++) {
            int auxnumber = numeros[i];
            while (auxnumber>0){
                digitos[i] = auxnumber%10;
                break;
            }
        }

        if ((digitos[0] == digitos[1]) || (digitos[1] == digitos[2]) || (digitos[0] == digitos[2])){
            return  true;
        }


        return false;
    }

    public static boolean isInRange(int parm){
        if(parm>=10 && parm <=1000){
            return true;
        }else {
            return false;
        }
    }

    public static int getGreatestCommonDivisor(int first, int second){
        if(first < 10 || second < 10){
            return -1;
        }
        while(first != second){
            if (first>second){
                first = first - second;
            }else {
                second = second - first;
            }
        }
        System.out.println("El MCD es : " + first);
        return first;
    }


    public static void printFactors(int number){
        String chain = "";
        if (number < 1){
            System.out.println("Invalid Value");
            return;
        }


        for (int i = 1; i <= number ; i++) {
            if (number%i == 0){
                chain = chain + i + " ";
            }
        }
        System.out.println(chain);
    }


    public static boolean isPerfectNumber(int number){

        if (number < 1){
            return false;
        }

        int perfectNumber = 0;

        for (int i = 1; i <= number ; i++) {
            if ((number%i == 0) && i!=number){
                perfectNumber = perfectNumber + i;
            }
        }

        System.out.println("Perfect Number: " + perfectNumber);
        if (number == perfectNumber){
            return true;
        }else {
            return false;
        }

    }

    public static void numberToWords(int number){
        if (number < 0){
            System.out.println("Invalid Value");
            return;
        }
        int reverse = reverse(number);
        int digit = 0;
        String chain = "";
        for (int i = 1; i <= getDigitCount(number) ; i++) {
            digit = reverse%10;
            if (digit > 0){
                String numero = "";
                switch (digit){
                    case 0:
                        numero = "Zero";
                        break;
                    case 1:
                        numero = "One";
                        break;
                    case 2:
                        numero = "Two";
                        break;
                    case 3:
                        numero = "Three";
                        break;
                    case 4:
                        numero = "Four";
                        break;
                    case 5:
                        numero = "Five";
                        break;
                    case 6:
                        numero = "Six";
                        break;
                    case 7:
                        numero = "Seven";
                        break;
                    case 8:
                        numero = "Eight";
                        break;
                    case 9:
                        numero = "Nine";
                        break;
                    default:
                        numero = "Invalid";
                        break;
                }
                chain = chain + numero + " ";
            }else {
                chain = chain + "Zero" + " ";
            }
            reverse/=10;
        }
        System.out.println(chain);
    }

    public static int reverse(int number){
        int reverse = 0;
        int digit = 0;
        int factor;
        if (number < 0){
            factor = -1;
        }else {
            factor = 1;
        }

        number = number * factor;

        while (number>0){
            digit = number%10;
            reverse*=10;
            reverse+=digit;
            number/=10;
        }
        System.out.println("Numero Reversado: " + reverse);
        return reverse * factor;
    }

    public static int getDigitCount(int number){
        int count = 0;
        int digit = 0;
        if (number < 0){
            return -1;
        }
        if (number == 0){
            return 1;
        }

        while (number>0){
            digit = number%10;
            count++;
            number/=10;
        }
        System.out.println("Conteo: " + count);
        return count;
    }







}
