package org.example;

import org.example.logicalLayer.Enums;
import org.example.logicalLayer.Plateau;
import org.example.logicalLayer.Position;
import org.example.logicalLayer.Rover;
import org.example.userLayer.CheckForRightInput;
import org.example.userLayer.ExtraFun;

import javax.swing.text.Utilities;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
       /* printString("Welcome to MARS");
        printString("Please insert dimensions of your world!!!");
        int x = CheckForRightInput.getNumber(sc);
        int y = CheckForRightInput.getNumber(sc);
        printString("Launching your Rover!!!");*/
        Plateau p = new Plateau(4,4);
        Rover r = new Rover(p);
        Position poz = r.getPosition();
        ExtraFun.printTheMap(p,poz);
        while (true){
            printString("Let`s explore");
            ExtraFun.printMenu();
            int choice;
            printString("Make your choice: ");
            choice=CheckForRightInput.getNumber(sc);
            switch (choice){
                case 1 -> {
                    r.roverMove(p);
                    //ExtraFun.printTheMap(p,poz);
                }
                case 2 ->{
                    Enums.Direction direction =Enums.Direction.valueOf(CheckForRightInput.getTheRightDirection(sc));
                    r.roverTurn(direction);
                    //ExtraFun.printTheMap(p,poz);
                }
                case 3 ->{
                    printString("Type your command:\n\tM -- move one cell\n\tR -- turn right\n\tL -- turn left");
                    String str = sc.nextLine();
                    char[] command = CheckForRightInput.onlyMLandR(str);
                    if (command != null) {
                        for (char c : command) {
                            if (c == 'M') {
                                r.roverMove(p);
                            } else r.roverTurn(Enums.Direction.valueOf(String.valueOf(c)));
                        }
                    }
                    System.out.println("After filter command:" +new String(command));
                    //ExtraFun.printTheMap(p,poz);
                }
            }
            ExtraFun.printTheMap(p,poz);
            if (choice == 4) break;
        }



    }


    //print the string in terminal
    public static void printString(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i));
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println();
    }
}