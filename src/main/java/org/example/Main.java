package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        printString("Welcome to MARS");
        printString("Please insert dimensions of your world!!!");
        int x = sc.nextInt();
        int y = sc.nextInt();
        Plateau pl = new Plateau(3,5);
        printString("Launch your Rover!!!");
        printString("Hit ENTER");
        System.out.println();
        Rover r = new Rover(pl);
    }


    //print the string in terminal
    public static void printString(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i));
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}