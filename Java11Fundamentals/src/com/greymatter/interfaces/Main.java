package com.greymatter.interfaces;

public class Main {
    public static void main(String[] args) {
        ITelephone jorgesPhone = new DeskPhone(999456236);
        jorgesPhone.powerOn();
        jorgesPhone.callPhone(999456236);
        jorgesPhone.answer();

        jorgesPhone = new MobilePhone(12345);
        jorgesPhone.powerOn();
        jorgesPhone.callPhone(12345);
        jorgesPhone.answer();
    }
}
