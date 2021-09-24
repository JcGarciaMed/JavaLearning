package com.greymatter.polymorphism;

public class DeluxeBurger extends Hamburguer{

    public DeluxeBurger() {
        super("Deluxe", "Sausage & Bacon", 14.59, "White");
        super.addHamburguerAddition1("chips", 2.75);
        super.addHamburguerAddition2("drink", 1.82);
    }

    @Override
    public void addHamburguerAddition1(String name, double price) {
        System.out.println("Cannot add aditional items to the deluxe burguer");
    }

    @Override
    public void addHamburguerAddition2(String name, double price) {
        System.out.println("Cannot add aditional items to the deluxe burguer");
    }

    @Override
    public void addHamburguerAddition3(String name, double price) {
        System.out.println("Cannot add aditional items to the deluxe burguer");
    }

    @Override
    public void addHamburguerAddition4(String name, double price) {
        System.out.println("Cannot add aditional items to the deluxe burguer");
    }
}
