package com.greymatter;

public class PC {
    private Case aCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case aCase, Monitor monitor, Motherboard motherboard) {
        this.aCase = aCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }
    public void powerUp(){
        aCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo(){
        System.out.println("looogooooooo om brainMatter");
        monitor.drawPixelAt(1200,50,"yellow");
    }


}
