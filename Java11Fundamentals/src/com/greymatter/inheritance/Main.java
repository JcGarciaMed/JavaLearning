package com.greymatter.inheritance;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Animal animal = new Animal("Animal", 1, 1,5 ,5);
        Dog dog = new Dog("Yorki", 8, 20,2,4,1,20,"long silky");

        dog.eat();
        dog.walk();
        dog.run();


        OutLander outlander = new OutLander(36);
        outlander.steer(45);
        outlander.accelerate(30);
        outlander.accelerate(20);

    }
}
