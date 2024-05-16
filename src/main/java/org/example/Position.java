package org.example;

import java.util.Random;

public class Position {
    private int x;
    private int y;
    private Enums.CompassDirection facing;

    public Position(Plateau p){
        Random rd =new Random();
        this.x = rd.nextInt(p.x()+1);
        this.y = rd.nextInt(p.y()+1);
        this.facing = Enums.CompassDirection.values()[rd.nextInt(4)];
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Enums.CompassDirection getFacing() {
        return this.facing;
    }

    public void setFacing(Enums.CompassDirection facing) {
        this.facing = facing;
    }
}
