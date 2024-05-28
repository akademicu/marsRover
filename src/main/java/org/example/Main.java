package org.example;

import org.example.logicalLayer.*;
import org.example.userLayer.CheckForRightInput;
import org.example.userLayer.ExtraFun;

import javax.swing.text.Utilities;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        printString("Welcome to MARS");
        printString("Please insert dimensions of your world!!!");

        System.out.print("X -> length = ");
        int x = CheckForRightInput.getNumber(sc);
        System.out.print("Y -> length = ");
        int y = CheckForRightInput.getNumber(sc);
        Plateau plateau = new Plateau(x,y);
        Rover rover = new Rover(plateau);
        printString("Any preferences for lunching?");
        System.out.println("1: Exact point \033[3mex.(2 1 S)\033[0m");
        System.out.println("2: Choose the landing sector \033[3mex. (NW, SE...)\033[0m");
        System.out.println("3: Random landing");
        printString("Make your choice - ");
        int landChoice = CheckForRightInput.getNumber(sc);
        switch (landChoice){
            case 1 -> rover.setPositionByPosition(Landing.getPositionFromUser(plateau));
            //case 2 -> methodToChooseTheSector();
            case 3 -> new Rover(plateau);
            default ->{
                System.out.println("Sorry, You messed the target");

            }
        }
        //System.exit(0);


        //printString("Launching your Rover!!!");


        Position poz = rover.getPosition();
        ExtraFun.printTheMap(plateau,poz);
        while (true){
            printString("Let`s explore");
            ExtraFun.printMenu();
            int choice;
            printString("Make your choice: ");
            choice=CheckForRightInput.getNumber(sc);
            switch (choice){
                case 1 -> {
                    rover.roverMove(plateau);
                }
                case 2 ->{
                    Enums.Direction direction =Enums.Direction.valueOf(CheckForRightInput.getTheRightDirection(sc));
                    rover.roverTurn(direction);
                }
                case 3 ->{
                    printString("Type your command:\n\tM -- move one cell\n\tR -- turn right\n\tL -- turn left");
                    String str = sc.nextLine();
                    char[] command = CheckForRightInput.onlyMLandR(str);
                    if (command != null) {
                        for (char c : command) {
                            if (c == 'M') {
                                rover.roverMove(plateau);
                            } else rover.roverTurn(Enums.Direction.valueOf(String.valueOf(c)));
                        }
                    }
                    System.out.println("After filtering command:" +new String(command));
                }
            }
            ExtraFun.printTheMap(plateau,poz);
            if (choice == 4) break;
        }
    }

    //prints the string in terminal letter by letter
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