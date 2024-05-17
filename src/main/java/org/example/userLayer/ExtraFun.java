package org.example.userLayer;

import org.example.logicalLayer.Plateau;
import org.example.logicalLayer.Position;
import java.util.HashMap;
import java.util.Map;

public class ExtraFun {

    public static void printTheMap(Plateau p, Position position){
        for (int y=p.y(); y>=0;y--){
            for (int x=0; x<=p.x();x++){
                if(position.getX() == x && position.getY() == y){
                    System.out.print(" x ");
                }else {
                    System.out.print(" . ");
                }
            }
            System.out.println();
        }
        System.out.println("Your position: "+position.toString());
    }


    public static void printMenu(){
        System.out.println(1+": Move forward");
        System.out.println(2+": Turn");
        System.out.println(3+": Type a command to move");
        System.out.println(4+": Exit");
    }


}
