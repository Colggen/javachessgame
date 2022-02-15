package com.github.maxim.chess.piecesCalculator;

import java.util.Scanner;

public class KnightCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        String k [] = s.split("\\.");
        a = Integer.parseInt(k[0]);
        b = Integer.parseInt(k[1]);
        c = Integer.parseInt(k[2]);
        d = Integer.parseInt(k[3]);
        if (k.length != 4) {
            System.out.println("Bad");
            return;
        }
        try {
            if(k.length==4) {
                if ((a >= 0 && a <= 255) && (b >= 0 && b <= 255) && (c >= 0 && c <= 255) && (d >= 0 && d <= 255)) {
                    System.out.println("Good");
                } else {
                    System.out.println("Bad");
                }
            }
        } catch (Exception e){
            System.out.println("Bad");
        }
//        if(st.countTokens() != 4) {
//            System.out.print("Bad");
//            return;
//        }
//        try {
//            if(st.countTokens()==4) {
//                while (st.hasMoreTokens()) {
//                    Integer address = Integer.parseInt(st.nextToken());
//                    if (0 > address || address > 255) {
//                        System.out.print("Bad");
//                        return;
//                    }
//                }
//            }
//            System.out.print("Good");
//        } catch (Exception e) {
//            System.out.print("Bad");
//        }


    }
}

