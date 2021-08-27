package com.greymatter;

public class Main {
    public static void main(String[] args) {
	// write your code here
        int newScore =  calculateScore("Jorge", 500);
        System.out.println("New Score is " + newScore);
        calculateScore(12);
        calculateScore();
    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score +" points");
        return score*1000;
    }

    public static int calculateScore(int score){
        System.out.println("Unnamed Player" + " scored " + score +" points");
        return score*2526;
    }

    public static int calculateScore(){
        int score = 256;
        System.out.println("Unnamed Player" + " scored " + score +" points");
        return score*2526;
    }
}
