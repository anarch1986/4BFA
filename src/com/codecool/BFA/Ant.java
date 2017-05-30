package com.codecool.BFA;

/**
 * Created by tomi on 2017.05.30..
 */
public abstract class Ant {
    int positionX;
    int positionY;

    public Ant(int positinX, int positionY) {
        this.positionX = positinX;
        this.positionY = positionY;
    }

    public int distanceFromQueen() {
        int distance = Math.abs(this.positionX)+Math.abs(this.positionY);
        return distance;
    }

    public abstract void move();
}
