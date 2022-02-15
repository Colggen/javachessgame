package com.github.maxim.chess.FiguresParsing;

import com.github.maxim.chess.BoardPosition.BoardPosition;
import com.github.maxim.chess.Figures.Bishop;
import com.github.maxim.chess.Figures.Knight;
import com.github.maxim.chess.Figures.Queen;
import com.github.maxim.chess.Figures.Rook;
import com.github.maxim.chess.KindsOfMove.*;

public class MoveParsing {

    public static Move parrsing(String s){
        if(s.length()==7) {
            if (s.charAt(6) == 'N') {
                return new PawnTransformation(bpparse(s.substring(0,2)),bpparse(s.substring(3,5)), new Knight());
            }
            else if (s.charAt(6) == 'B') {
                return new PawnTransformation(bpparse(s.substring(0, 2)), bpparse(s.substring(3, 5)), new Bishop());
            }
            else if(s.charAt(6) =='Q'){
                return new PawnTransformation(bpparse(s.substring(0, 2)), bpparse(s.substring(3, 5)), new Queen());
            }
            else {
                return new PawnTransformation(bpparse(s.substring(0, 2)), bpparse(s.substring(3, 5)), new Rook());
            }
        }
        else if(s.equals("0-0 wh")){
            return new SCastling(true);
        }
        else if(s.equals("0-0 bl")){
            return new SCastling(false);
        }
        else if(s.equals("0-0-0 wh")){
            return new LCastling(true);
        }
        else if(s.equals("0-0-0 bl")){
            return new LCastling(false);
        }
        else{
            return new StandartMove(bpparse(s.substring(0,2)),bpparse(s.substring(3,5)));
        }
    }

    private static BoardPosition bpparse(String s){
        int a = ((int) s.charAt(0)) -((int)'a')+1;
        int b = ((int) s.charAt(1))-((int)'1')+1;
        return new BoardPosition(a,b);
    }
}
