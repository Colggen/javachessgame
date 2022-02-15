package com.github.maxim.chess.Figures;

import com.github.maxim.chess.BoardPosition.BoardPosition;
import com.github.maxim.chess.MoveExceptions.ImpossibleMoveException;

import java.util.ArrayList;
import java.util.List;

public class Rook extends Piece{


    public Rook(boolean iswhite, BoardPosition position) {
        super(iswhite, position);
    }

    public Rook(boolean isWhite, boolean hasMoved, BoardPosition position) {
        super(isWhite, hasMoved, position);
    }

    public Rook(){

    }

    @Override
    public boolean possibleMove(BoardPosition bp) {
        if(bp.getHorizontal() <=8 &&  bp.getHorizontal()>=1 &&  bp.getVertical() <=8 && bp.getVertical()>=1){
            if(bp.getHorizontal()==getPosition().getHorizontal() || bp.getVertical()==getPosition().getVertical()){
                return true;
            }
        }
        throw new ImpossibleMoveException();
    }

    @Override
    public List<BoardPosition> trace(BoardPosition p) {
        List<BoardPosition> bp = new ArrayList<>();
        if(possibleMove(p)) {
            if (getPosition().getHorizontal() == p.getHorizontal()) {
                for (int i = getPosition().getVertical() + 1; i < p.getVertical(); i++) {
                    bp.add(new BoardPosition(i, getPosition().getHorizontal()));
                }
            } else {
                for (int i = getPosition().getHorizontal() + 1; i < p.getHorizontal(); i++) {
                    bp.add(new BoardPosition(getPosition().getVertical(), i));
                }
            }
        }
        return bp;
    }

    @Override
    public char getUnicodeSymbol() {
        if(getisWhite()){
            return '\u2656';
        }
        else{
            return '\u265C';
        }
    }

}
