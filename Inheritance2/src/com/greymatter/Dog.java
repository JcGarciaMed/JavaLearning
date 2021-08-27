package com.greymatter;

public class Dog extends Animal{
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;


    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew(){
        System.out.println("This dog is chewing");
    }

    @Override
    public void eat() {
        chew();
        super.eat();
    }

    public void walk(){
        System.out.println("this dog is walking");
        move(25);
    }

    public void run(){
        System.out.println("this dog is running");
        super.move(50);
    }

    private void moveLegs(int speed){
        System.out.println("this dog is moving his legs at + " + speed);
    }

    @Override
    public void move(int speed) {
        moveLegs(speed);
        super.move(speed);
    }
}
