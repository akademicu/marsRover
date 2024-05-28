package org.example.logicalLayer;

public class Rover {
    private Position position;

    public Rover(Plateau p){
        this.position = new Position(p);
    }

    public void setPositionByPosition(Position position){
        this.position = position;
    }



    public Position getPosition(){
        return position;
    }
    public void setFacing(Enums.CompassDirection facing){
        this.position.setFacing(facing);
    }
    public void setPosition(int x, int y, Enums.CompassDirection facing){
        this.position.setX(x);
        this.position.setY(y);
        this.position.setFacing(facing);
    }
    //let`s move
    public void roverMove(Plateau p){
        Enums.CompassDirection currentFacing = this.position.getFacing();
        int currentX = this.position.getX();
        int currentY = this.position.getY();
        switch (currentFacing){
            case N -> {
                if(currentY == p.y()){
                    this.position.setY(p.y());
                }else this.position.setY(currentY+1);
            }
            case S -> {
                if(currentY == 0){
                    this.position.setY(0);
                }else this.position.setY(currentY-1);
            }
            case E -> {
                if (currentX == p.x()){
                    this.position.setX(p.x());
                }else this.position.setX(currentX+1);
            }
            case W -> {
                if (currentX == 0){
                    this.position.setX(0);
                }else this.position.setX(currentX-1);
            }
        }
    }

    // turn left or right
    public void roverTurn(Enums.Direction direction){
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
