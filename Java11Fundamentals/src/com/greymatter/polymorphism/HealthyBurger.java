package com.greymatter.polymorphism;

public class HealthyBurger extends Hamburguer{
    private String healthyExtra1Name;
    private double healthyExtra1Price;

    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy Burger", meat, price, "Brown Rye");
    }

    public void addHealthAddition1(String name, double price){
        this.healthyExtra1Name=name;
        this.healthyExtra1Price= price;
        System.out.println("Added " + this.healthyExtra1Name + " for an extra " + this.healthyExtra1Price);
    }

    public void addHealthAddition2(String name, double price){
        this.healthyExtra2Name=name;
        this.healthyExtra2Price= price;
        System.out.println("Added " + this.healthyExtra2Name + " for an extra " + this.healthyExtra2Price);
    }

    @Override
    public double itemizeHamburguer() {

        if (this.healthyExtra1Name!=null){
            return super.itemizeHamburguer() +this.healthyExtra1Price;
        }else {
            return super.itemizeHamburguer() +this.healthyExtra2Price;
        }

    }
}
