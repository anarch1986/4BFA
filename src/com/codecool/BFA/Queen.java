package com.codecool.BFA;

/**
 * Created by tomi on 2017.05.30..
 */
public class Queen extends Ant{

    private static Queen queen = new Queen();

    private Queen() {
        super(0,0);
    }

    public static Queen getInstance(){
        return queen;
    }

    public void move() {
        return;
    }
}
