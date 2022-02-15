package com.github.maxim.chess.Figures;

import com.github.maxim.chess.BoardPosition.BoardPosition;
import com.github.maxim.chess.MoveExceptions.ImpossibleMoveException;;

import java.util.ArrayList;
import java.util.List;

public class Bishop extends Piece {

    List<BoardPosition> c = new ArrayList<>();

    public Bishop(){

    }
    public Bishop(boolean iswhite, BoardPosition position) {
        super(iswhite, position);
    }


    @Override
    public boolean possibleMove(BoardPosition bp) {
        if(bp.getHorizontal() <=8 &&  bp.getHorizontal()>=1 &&  bp.getVertical() <=8 && bp.getVertical()>=1){
            if(Math.abs(bp.getHorizontal()-getPosition().getHorizontal()) == Math.abs(bp.getVertical()-getPosition().getVertical())){
                return true;
            }
        }
        throw new ImpossibleMoveException();
    }

    @Override
    public List<BoardPosition> trace(BoardPosition p) {
        int start1 = 0;
        int start2 = 0;
        int end2 = 0;
        if (getPosition().getVertical() < p.getVertical()) {
            start1 = getPosition().getVertical();
        } else {
            start1 = p.getVertical();
        }
        if (getPosition().getHorizontal() < p.getHorizontal()) {
            start2 = getPosition().getHorizontal();
            end2 = p.getHorizontal();
        } else {
            start2 = p.getHorizontal();
            end2 = getPosition().getHorizontal();
        }
        for (int i = start1 + 1; i < end2; i++) {
            for (int j = start2 + 1; j < end2; j++) {
                if (Math.abs(i - j) == Math.abs(getPosition().getHorizontal() - p.getVertical())) {
                    c.add(new BoardPosition(i, j));
                }
            }
        }
        return c;
    }

    @Override
    public char getUnicodeSymbol() {
        if(getisWhite()){
            return '\u2657';
        }
        else{
            return '\u265D';
        }
    }
}