package org.example;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import javax.swing.*;

class RoverTest {

    Plateau p = new Plateau(10,11);

    @Test
    void roverMoveTest() {
        //Position position = new Position(p);
        Rover r1 = new Rover(p);
        r1.setPosition(0,0,Enums.CompassDirection.W);
        r1.roverMove(p,4);
        assertEquals(0,r1.getPosition().getX());

        r1.setPosition(0,0,Enums.CompassDirection.S);
        r1.roverMove(p,4);
        assertEquals(0,r1.getPosition().getY());

        r1.setPosition(0,5, Enums.CompassDirection.E);
        r1.roverMove(p,7);
        assertEquals(7,r1.getPosition().getX());

    }



    @Test
    void roverTurn() {
    }
}