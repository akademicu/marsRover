package org.example;

public class Rover {
    private Position position;


    public Rover(Plateau p){
        this.position = new Position(p);
    }
    public Position getPosition(){
        return position;
    }
    public void setPosition(int x, int y, Enums.CompassDirection facing){
        this.position.setX(x);
        this.position.setY(y);
        this.position.setFacing(facing);
    }


    //let`s move
    public void roverMove(Plateau p, int numOfCells){
        Enums.CompassDirection currentFacing = this.position.getFacing();
        int currentX = this.position.getX();
        int currentY = this.position.getY();
        switch (currentFacing){
            case N -> {
                if(numOfCells <= p.y()-currentY){
                    this.position.setY(currentY+numOfCells);
                }else this.position.setY(p.y());
            }
            case S -> {
                if(numOfCells <= currentY){
                    this.position.setY(currentY-numOfCells);
                }else this.position.setY(0);
            }
            case E -> {
                if (numOfCells <= p.x()-currentX){
                    this.position.setX(currentX+numOfCells);
                }else this.position.setX(p.x());
            }
            case W -> {
                if (numOfCells <= currentX){
                    this.position.setX(currentX-numOfCells);
                }else this.position.setX(0);
            }
        }
    }

    // turn left or right
    public void roverTurn(Plateau p, Enums.Direction direction){
        Enums.CompassDirection currentFacing = position.getFacing();
        switch (currentFacing){
            case N -> {
                if (direction == Enums.Direction.L){
                    this.position.setFacing(Enums.CompassDirection.W);
                }else this.position.setFacing(Enums.CompassDirection.E);
            }
            case S -> {
                if (direction == Enums.Direction.L){
                    this.position.setFacing(Enums.CompassDirection.E);
                }else this.position.setFacing(Enums.CompassDirection.W);
            }
            case E -> {
                if (direction == Enums.Direction.L){
                    this.position.setFacing(Enums.CompassDirection.N);
                }else this.position.setFacing(Enums.CompassDirection.S);
            }
            case W -> {
                if (direction == Enums.Direction.L){
                    this.position.setFacing(Enums.CompassDirection.S);
                }else this.position.setFacing(Enums.CompassDirection.N);
            }
        }
    }



}
