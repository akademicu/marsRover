package org.example.userLayer;

import org.example.Main;
import org.example.logicalLayer.Enums;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckForRightInput {

    //returns ony int
    public static int getNumber(Scanner sc){
        while (true) {
            //Main.printString("Number = ");
            String str = sc.nextLine();
            try {
                return Integer.parseInt(str);
            } catch (Exception e) {
                Main.printString(str + " -- Is not a num, try again");
            }
        }
    }

    public static char[] onlyMLandR(String input){
        input = input.toUpperCase();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            String s = String.valueOf(input.charAt(i));
            if (s.matches("[MLR]")){
                sb.append(s);
            }
        }
        if (sb.isEmpty()){
            return null;
        }else {
            int lenghtOfArr = sb.length();
            char[] output = new char[lenghtOfArr];
            sb.getChars(0,lenghtOfArr,output,0);
            return output;
        }
    }

    public static String getTheRightDirection(Scanner sc){
        while (true) {
            Main.printString("Type L -- left or R -- right");
            String str = sc.nextLine();
            Pattern pattern = Pattern.compile("[LR]");
            Matcher matcher = pattern.matcher(str.toUpperCase());
            if (matcher.find()) {
                return matcher.group(0);
            } else {
                System.out.println("Did`t find any L or R in input");
            }
        }
    }



}
