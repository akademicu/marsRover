package org.example.logicalLayer;

import java.util.Random;

public class Position {
    private int x;
    private int y;
    private Enums.CompassDirection facing;

    //random position on the plateau
    public Position(Plateau p){
        Random rd =new Random();
        this.x = rd.nextInt(p.x()+1);
        this.y = rd.nextInt(p.y()+1);
        this.facing = Enums.CompassDirection.values()[rd.nextInt(4)];
    }

    public Position(int x, int y, Enums.CompassDirection facing){
        this.x = x;
        this.y = y;
        this.facing = facing;
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

    @Override
    public String toString() {
        return  " ("+x +
                " " + y +
                " " + facing+")";
    }
}
