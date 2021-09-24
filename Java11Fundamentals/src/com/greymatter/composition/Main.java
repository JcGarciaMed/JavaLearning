package com.greymatter.composition;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Case theCase = new Case("220b","Dell", "240", new Dimensions(25,45,5));
        Monitor monitor = new Monitor("27ich beast", "Acer", "27", new Resolution(45,25));
        Motherboard motherboard = new Motherboard("BJ-200","ASUS", 4 , 6 , "V2.44");
        PC thePC = new PC(theCase,monitor,motherboard);
        thePC.powerUp();

        Wall wall1= new Wall("West");
        Wall wall2= new Wall("East");
        Wall wall3= new Wall("South");
        Wall wall4= new Wall("North");

        Ceiling ceiling = new Ceiling(12,55);
        Bed bed = new Bed("Modern", 4,3,2,1);
        Lamp lamp = new Lamp("Classic", false,75);

        Bedroom bedroom = new Bedroom("Jorge's", wall1, wall2, wall3, wall4, ceiling,bed,lamp);
        bedroom.makeBed();
        bedroom.getLamp().turnOn();


    }
}
