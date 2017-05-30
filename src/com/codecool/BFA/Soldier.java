package com.codecool.BFA;

/**
 * Created by tomi on 2017.05.30..
 */
public class Soldier extends Ant {
    int moveCounter=0;

    

    public void move() {
        if (this.moveCounter==0) {
            this.positionY+=1;
            this.moveCounter+=1;
        }
        else if (this.moveCounter==1) {
            this.positionX +=1;
            this.moveCounter+=1;
        }
        else if (this.moveCounter==2) {
            this.positionY-=1;
            this.moveCounter+=1;
        }
        else if(this.moveCounter==3) {
            this.positionX-=1;
            this.moveCounter=0;
        }
    }
}
