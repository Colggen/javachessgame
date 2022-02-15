package com.github.maxim.chess.piecesCalculator;

import com.github.maxim.chess.BoardPosition.BoardPosition;
import com.github.maxim.chess.Figures.Pawn;

public class PawnCheck {
    public static void main(String [] args){
        Pawn p1 = new Pawn(true,new BoardPosition(0,1));
        if(p1.possibleMove(new BoardPosition(0,2))!=true){
            throw new RuntimeException();
        }
        else{
            System.out.println("YESSSSS");
        }
        if(p1.possibleMove(new BoardPosition(0,3))!=true){
            throw new RuntimeException();
        }
        else{
            System.out.println("YESSSSS");
        }
        if(p1.possibleMove(new BoardPosition(0,5))){
            throw new RuntimeException();
        }
        else{
            System.out.println("YESSSSS");
        }
        if(p1.possibleMove(new BoardPosition(0,6))){
            throw new RuntimeException();
        }
        else{
            System.out.println("YESSSSS");
        }
        if(p1.possibleMove(new BoardPosition(0,7))){
            throw new RuntimeException();
        }
        else{
            System.out.println("YESSSSS");
        }
        if(p1.possibleMove(new BoardPosition(0,9))){
            throw new RuntimeException();
        }
        else{
            System.out.println("YESSSSS");
        }
        if(p1.possibleMove(new BoardPosition(1,5))){
            throw new RuntimeException();
        }
        else{
            System.out.println("YESSSSS");
        }
        if(p1.possibleMove(new BoardPosition(1,5))){
            throw new RuntimeException();
        }
        else{
            System.out.println("YESSSSS");
        }
    }
}
