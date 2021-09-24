package com.greymatter.encapsulation;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Player player = new Player();
        player.name = "Jorge";
        player.health = 200;
        player.weapon = "Sword";

        int damage = 10;
        player.loseHelath(damage);
        System.out.println("Remaining Health:  " + player.healthRemain());

        damage = 11;
        player.loseHelath(damage);
        System.out.println("Remaining Health:  " + player.healthRemain());

        EnhancedPlayer player2 = new EnhancedPlayer("Jorge", 78, "Sword");
        System.out.println("Initial Health..." + player2.getHitPoints());


        //Printer
        Printer printer = new Printer(50,true);
        System.out.println("Intital Page Count: " + printer.getPagesPrinted());
        int pagesPrintes = printer.printPages(4);
        System.out.println("Printed: " + pagesPrintes  + " new total print count: " + printer.getPagesPrinted());
        pagesPrintes = printer.printPages(2000);
        System.out.println("Printed: " + pagesPrintes  + " new total print count: " + printer.getPagesPrinted());

    }
}
