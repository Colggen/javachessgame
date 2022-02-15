package com.github.maxim.chess.piecesCalculator;

import com.github.maxim.chess.BoardPosition.BoardPosition;
import com.github.maxim.chess.Figures.King;

public class KingCheck {
    public static void main(String[] args) {
        King k = new King(true,new BoardPosition(1,1));
        if(k.possibleMove(new BoardPosition(1,2))!=true){
            throw new RuntimeException();
        }
        else{
            System.out.println("YESSSSSS");
        }
        if(k.possibleMove(new BoardPosition(2,1))!=true){
            throw new RuntimeException();
        }
        else{
            System.out.println("YESSSSSS");
        }
        if(k.possibleMove(new BoardPosition(2,2))!=true){
            throw new RuntimeException();
        }
        else{
            System.out.println("YESSSSSS");
        }
        if(k.possibleMove(new BoardPosition(3,2))!=true){
            throw new RuntimeException();
        }
        else{
            System.out.println("YESSSSSS");
        }
        if(k.possibleMove(new BoardPosition(3,2))!=true){
            throw new RuntimeException();
        }
        else{
            System.out.println("YESSSSSS");
        }
        if(k.possibleMove(new BoardPosition(3,2))!=true){
            throw new RuntimeException();
        }
        else{
            System.out.println("YESSSSSS");
        }
    }
}
