package com.github.maxim.chess.piecesCalculator;

import java.util.Scanner;

public class QueenCheck {
    public static void main (String [] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int n = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int g = Math.min(c,Math.min(a,b));
        if(k==2){
            System.out.println(g);
        }

        if(k==1){
            System.out.println(a-(n-b));
        }

    }
}
