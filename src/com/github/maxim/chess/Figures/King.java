package com.github.maxim.chess.Figures;

import com.github.maxim.chess.BoardPosition.BoardPosition;
import com.github.maxim.chess.MoveExceptions.ImpossibleMoveException;

import java.util.ArrayList;
import java.util.List;

public class King extends Piece {

    List<BoardPosition> bp = new ArrayList<>();

    public King(boolean iswhite, BoardPosition position) {
        super(iswhite, position);
    }

    public King(boolean isWhite, boolean hasMoved, BoardPosition position) {
        super(isWhite, hasMoved, position);
    }

    @Override
    public boolean possibleMove(BoardPosition bp) {
        if(bp.getHorizontal() <=8 &&  bp.getHorizontal()>=1 &&  bp.getVertical() <=8 && bp.getVertical()>=1){
            if(Math.abs(bp.getHorizontal()-getPosition().getHorizontal())==1 || Math.abs(bp.getVertical()-getPosition().getVertical())==1){
                return true;
            }
        }
        throw new ImpossibleMoveException();
    }

    @Override
    public List<BoardPosition> trace(BoardPosition p) {

        return bp;
    }

    @Override
    public char getUnicodeSymbol() {
        if(getisWhite()){
            return '\u2654';
        }
        else{
            return '\u265A';
        }
    }
}
