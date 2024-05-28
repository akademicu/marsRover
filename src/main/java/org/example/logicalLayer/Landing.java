package org.example.logicalLayer;

import org.example.userLayer.CheckForRightInput;

import java.util.Scanner;

public class Landing {

    //returns a position from plateau
    public static Position getPositionFromUser(Plateau plateau){
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Let's choose the place");
            System.out.println("X position: in range (0--" + plateau.x() + "): ");
            int x = CheckForRightInput.getNumber(sc);
            System.out.println("Y position: in range (0--" + plateau.y() + "): ");
            int y = CheckForRightInput.getNumber(sc);
            if (x < 0 || x > plateau.x() || y < 0 || y > plateau.y()) {
                System.out.println("Wrong insert for Y or X");
            }else{
                String facingStr = CheckForRightInput.getTheRightDirection(sc);
                Enums.CompassDirection facing = Enums.CompassDirection.valueOf(facingStr);
                return new Position(x,y,facing);
            }
        }
    }

}
