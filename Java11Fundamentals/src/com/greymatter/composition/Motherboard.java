package com.greymatter.composition;

public class Motherboard {
    private String model;
    private String manufacturer;
    private int ramSlots;
    private int cardSolts;
    private String bios;

    public Motherboard(String model, String manufacturer, int ramSlots, int cardSolts, String bios) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.ramSlots = ramSlots;
        this.cardSolts = cardSolts;
        this.bios = bios;
    }

    public void loadProgram(String programName){
        System.out.println("Loading " + programName);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public void setRamSlots(int ramSlots) {
        this.ramSlots = ramSlots;
    }

    public int getCardSolts() {
        return cardSolts;
    }

    public void setCardSolts(int cardSolts) {
        this.cardSolts = cardSolts;
    }

    public String getBios() {
        return bios;
    }

    public void setBios(String bios) {
        this.bios = bios;
    }
}
