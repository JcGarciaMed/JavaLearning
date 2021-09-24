package com.greymatter.ifKeyWordAndCodeBlocks;

public class Main {

    public static void main(String[] args) {
	// write your code here
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        int highScore = calculateScoreValue(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final Score Calculation: " + highScore);

        String playerName = "Jorge Carlos Garcia";



        int calculatedHighScore = calculateHighScorePosition(score);
        System.out.println("Calculated score is : " + calculatedHighScore);

        displayHighScorePosition(playerName, calculatedHighScore);

        if (score==5000){
            System.out.println("Your Score was 5000");
        }

        if (score==4000)
            System.out.println("Your Score was 5000");
            System.out.println("This Was Executed"); // this must not be executed

        if (score==4000) {
            //Code Block
            System.out.println("Your Score was 5000");
            System.out.println("This Was Executed");
        }

        if (score<5000){
            System.out.println("Your Score was less than 5000");
        } else {
            System.out.println("Got Here");
        }

        if (score<=5000){
            System.out.println("Your Score was less than or equal 5000");
        } else {
            System.out.println("Got Here");
        }

        if (score<5000 && score > 1000){
            System.out.println("Your Score was less than 5000 but greater than 1000");
        } else if(score < 1000){
            System.out.println("Your Score was less than 1000");
        } else {
            System.out.println("Got Here");
        }

/*        if (gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore+=100;
            System.out.println("Your final Score was: " + finalScore);
        }*/

        calculateScore(gameOver, score, levelCompleted, bonus);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        calculateScore(gameOver, score, levelCompleted, bonus);

/*        if (gameOver){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final Score was: " + finalScore);
        }*/

        checkNumber(25-25 );
    }

    public static void calculateScore(boolean gameOver, int score,  int levelCompleted, int bonus){

        if (gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore+=1000;
            System.out.println("Your final Score was: " + finalScore);
        }
    }

    public static int calculateScoreValue(boolean gameOver, int score,  int levelCompleted, int bonus){
        if (gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore+=1000;   
            return  finalScore;
        }
        return -1;
    }

    public static void displayHighScorePosition(String playerName, int position){
        System.out.println(playerName + " managed to get into position " + position + " on the score table");
    }

    public static int calculateHighScorePosition(int score){

/*        if (score >= 1000){
            return  1;
        }else if(score >= 500){
            return  2;
        }else if(score >= 100){
            return  3;
        }else{
            return 4;
        }*/
        int position = 4;
        
        if (score >= 1000){
            position = 1;
        }else if(score >= 500){
            position = 2;
        }else if(score >= 100);{
            position = 3;
        }
        return  position;

    }

    public static void checkNumber(int number){
        if (number > 0){
            System.out.println("positive");
        }else if(number < 0){
            System.out.println("negative");
        }else {
            System.out.println("zero");
        }


    }
}
