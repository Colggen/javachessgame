package com.github.maxim.chess.piecesCalculator;

import java.util.Scanner;

public class BishopCheck {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        for (int i = 0; i < line.length()/2; i++){
            if (line.charAt(i) != line.charAt(line.length() - i - 1)) {
                System.out.print("NOT");
                return;
            }
        }
        System.out.print("YES");
    }
}