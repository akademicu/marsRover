package org.example.userLayer;

import org.example.Main;
import java.util.Scanner;

public class CheckForRightInput {

    //returns ony int
    public static int getNumber(Scanner sc){
        while (true) {
            Main.printString("Number = ");
            String str = sc.nextLine();
            try {
                int num = Integer.parseInt(str);
                return num;
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



}
