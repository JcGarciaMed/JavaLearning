package com.greymatter.encapsulation;

public class EnhancedPlayer {
    private String name;
    private int hitPoints =100;
    private String weapon;

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        this.weapon = weapon;
        if (health>0 && health <=100){
            this.hitPoints = health;
        }
    }

    public void loseHelath(int damage){
        this.hitPoints = this.hitPoints - damage;
        if(this.hitPoints <=0){
            System.out.println("Player Knocked out");
        }
    }

    public int getHitPoints() {
        return hitPoints;
    }
}
