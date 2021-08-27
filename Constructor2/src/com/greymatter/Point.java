package com.greymatter;

public class Point {
    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(){
        double element1 = 0 - x;
        double element2 = 0 - y;
        double distancia =  Math.sqrt(Math.pow(element1,2) + Math.pow(element2,2));
        return distancia;
    }

    public double distance(int x, int y){
        double element1 = x - this.x;
        double element2 = y - this.y;
        double distancia =  Math.sqrt(Math.pow(element1,2) + Math.pow(element2,2));
        return distancia;
    }

    public double distance(Point point){
        double element1 = point.x - this.x;
        double element2 = point.y - this.y;
        double distancia =  Math.sqrt(Math.pow(element1,2) + Math.pow(element2,2));
        return distancia;
    }
}
