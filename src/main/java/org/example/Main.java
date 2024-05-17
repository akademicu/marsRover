package org.example;

import org.example.logicalLayer.Plateau;
import org.example.logicalLayer.Rover;
import org.example.userLayer.CheckForRightInput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int i = CheckForRightInput.getNumber(sc);
        System.out.println(i);
        printString("Welcome to MARS");
        printString("Please insert dimensions of your world!!!");
        int x = sc.nextInt();
        int y = sc.nextInt();
        printString("Launching your Rover!!!");
        Plateau p = new Plateau(x,y);
        Rover r = new Rover(p);


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